/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends wda {
    private int field_r;
    static int field_q;
    private int field_p;
    private int field_o;

    final static void a(int param0, byte param1) {
        int discarded$2 = 0;
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            opa.a(ap.field_d, 0, ola.field_Eb, param0, (byte) -100, ota.field_c, true);
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (ola.field_Eb <= var2_int) {
                    break L3;
                  } else {
                    boa.field_n[var2_int - -param0] = var2_int;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                opa.a(ma.field_g, param0, ola.field_Eb - -param0, param0 + param0, (byte) -100, kc.field_a, false);
                break L2;
              }
              L4: {
                if (param0 >= ola.field_Eb) {
                  break L4;
                } else {
                  ola.field_Eb = param0;
                  break L4;
                }
              }
              L5: {
                if (param1 == 29) {
                  break L5;
                } else {
                  discarded$2 = ri.a(10, -96, -65);
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "ri.CA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void e(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var1 = null;
        kh var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        mu var6 = null;
        String var7 = null;
        mu var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_11_0 = 0;
        mu stackIn_50_0 = null;
        mu stackIn_55_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mu stackOut_49_0 = null;
        mu stackOut_54_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_ref = vc.field_q;
            var2 = var1_ref.h(255);
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
                      var3 = var1_ref.e((byte) -76);
                      ol.field_b = var3.intern();
                      var4 = var1_ref.h(255);
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
                  var3 = var1_ref.e((byte) -76);
                  if (var3.equals("")) {
                    var3 = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var4_ref_String = var1_ref.e((byte) -76);
                  var5 = var1_ref.e((byte) -76);
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
                    fieldTemp$2 = ii.field_a;
                    ii.field_a = ii.field_a + 1;
                    var6.field_Db = fieldTemp$2;
                    fla.field_f.b((byte) -61, var6);
                    break L7;
                  }
                }
                L8: {
                  if (var3 == null) {
                    break L8;
                  } else {
                    var3 = var3.intern();
                    break L8;
                  }
                }
                var6.field_vb = var5;
                var6.field_Cb = var3;
                var6.field_tb = var4_ref_String;
                var6.p(70);
                var7_ref = (mu) ((Object) fla.field_f.f(-80));
                L9: while (true) {
                  L10: {
                    L11: {
                      if (null == var7_ref) {
                        break L11;
                      } else {
                        stackOut_49_0 = (mu) (var7_ref);
                        stackIn_55_0 = stackOut_49_0;
                        stackIn_50_0 = stackOut_49_0;
                        if (var9 != 0) {
                          break L10;
                        } else {
                          if (!ol.a(stackIn_50_0, true, var6)) {
                            break L11;
                          } else {
                            var7_ref = (mu) ((Object) fla.field_f.e(param0 + -14058));
                            if (var9 == 0) {
                              continue L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    stackOut_54_0 = (mu) (var7_ref);
                    stackIn_55_0 = stackOut_54_0;
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
                    ln.a(var7_ref, var6, (byte) 120);
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
                if (-2 != (var1_ref.h(255) ^ -1)) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L15;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L15;
                }
              }
              L16: {
                L17: {
                  var3_int = stackIn_11_0;
                  var4_ref_String = var1_ref.e((byte) -76);
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
                var5 = var1_ref.e((byte) -76);
                break L16;
              }
              L18: {
                var6 = uh.a(var4_ref_String, param0 ^ -14105);
                var7 = var1_ref.e((byte) -76);
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
                  var6 = uh.a(var7, param0 + -14132);
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
                  fieldTemp$3 = tba.field_k;
                  tba.field_k = tba.field_k + 1;
                  var6.field_Db = fieldTemp$3;
                  wv.field_l.b((byte) -116, var6);
                  break L20;
                }
              }
              var6.field_yb = var5;
              var6.field_tb = var4_ref_String;
              var6.field_vb = var7;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "ri.N(" + param0 + ')');
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ri.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
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
                    stackOut_3_0 = 0;
                    stackOut_3_1 = 1 & param2;
                    stackIn_10_0 = stackOut_3_0;
                    stackIn_10_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 == stackIn_4_1) {
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
                stackOut_9_0 = 1;
                stackOut_9_1 = param2;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L2;
              }
              if (stackIn_10_0 == stackIn_10_1) {
                stackOut_12_0 = param0 * var3_int;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (param1 == 0) {
                  stackOut_17_0 = var3_int;
                  stackIn_18_0 = stackOut_17_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_15_0 = -97;
                  stackIn_16_0 = stackOut_15_0;
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
        int stackOut_3_0 = 0;
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
            stackOut_3_0 = 16;
            stackIn_4_0 = stackOut_3_0;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("ri.R(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("ri.O(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ri.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
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
        int stackOut_3_0 = 0;
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
            stackOut_3_0 = param1;
            stackIn_4_0 = stackOut_3_0;
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
        boolean discarded$2 = false;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        nh stackOut_3_0 = null;
        nh stackOut_1_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
                  discarded$2 = var9.grabPixels();
                  stackOut_3_0 = param0.a(var8, var7, 122, var6, var6, 0);
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  stackOut_1_0 = (nh) null;
                  stackIn_2_0 = stackOut_1_0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (InterruptedException) (Object) decompiledCaughtException;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
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
            stackOut_7_0 = (RuntimeException) (var3_ref2);
            stackOut_7_1 = new StringBuilder().append("ri.EA(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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
