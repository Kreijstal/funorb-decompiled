/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends wda {
    private int field_r;
    static int field_q;
    private int field_p;
    private int field_o;

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
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
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "ri.CA(" + param0 + 44 + 29 + 41);
        }
    }

    final static void e() {
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
            if (var2 != 0) {
              if (var2 != 1) {
                if (var2 != 2) {
                  if (var2 == 3) {
                    L1: {
                      if (2 != ae.field_g) {
                        break L1;
                      } else {
                        ae.field_g = 1;
                        break L1;
                      }
                    }
                    return;
                  } else {
                    if (var2 != 4) {
                      ssa.a("F1: " + kk.a(32), (byte) 116, (Throwable) null);
                      int discarded$4 = 60;
                      dea.a();
                      break L0;
                    } else {
                      ae.field_g = 1;
                      var3 = var1_ref.e((byte) -76);
                      ol.field_b = var3.intern();
                      var4 = var1_ref.h(255);
                      int discarded$5 = 3;
                      ifa.d(var4);
                      return;
                    }
                  }
                } else {
                  L2: {
                    if (1 != ae.field_g) {
                      break L2;
                    } else {
                      ae.field_g = 2;
                      break L2;
                    }
                  }
                  return;
                }
              } else {
                L3: {
                  if (hia.field_s != null) {
                    break L3;
                  } else {
                    hia.field_s = new af(128);
                    ii.field_a = 0;
                    break L3;
                  }
                }
                L4: {
                  var3 = var1_ref.e((byte) -76);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var4_ref_String = var1_ref.e((byte) -76);
                  var5 = var1_ref.e((byte) -76);
                  var6 = wp.a(121, var4_ref_String);
                  if (null == var6) {
                    var6 = wp.a(107, var5);
                    if (var6 == null) {
                      break L5;
                    } else {
                      hia.field_s.a(-1, (od) (Object) var6, (long)jd.a(1, (CharSequence) (Object) var4_ref_String).hashCode());
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var6 != null) {
                    break L6;
                  } else {
                    var6 = new mu();
                    hia.field_s.a(-1, (od) (Object) var6, (long)jd.a(1, (CharSequence) (Object) var4_ref_String).hashCode());
                    int fieldTemp$6 = ii.field_a;
                    ii.field_a = ii.field_a + 1;
                    var6.field_Db = fieldTemp$6;
                    fla.field_f.b((byte) -61, (vg) (Object) var6);
                    break L6;
                  }
                }
                L7: {
                  if (var3 == null) {
                    break L7;
                  } else {
                    var3 = var3.intern();
                    break L7;
                  }
                }
                var6.field_vb = var5;
                var6.field_Cb = var3;
                var6.field_tb = var4_ref_String;
                var6.p(70);
                var7_ref = (mu) (Object) fla.field_f.f(-80);
                L8: while (true) {
                  L9: {
                    L10: {
                      if (null == var7_ref) {
                        break L10;
                      } else {
                        stackOut_49_0 = (mu) var7_ref;
                        stackIn_55_0 = stackOut_49_0;
                        stackIn_50_0 = stackOut_49_0;
                        if (var9 != 0) {
                          break L9;
                        } else {
                          if (!ol.a(stackIn_50_0, true, var6)) {
                            break L10;
                          } else {
                            var7_ref = (mu) (Object) fla.field_f.e(122);
                            if (var9 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                    }
                    stackOut_54_0 = (mu) var7_ref;
                    stackIn_55_0 = stackOut_54_0;
                    break L9;
                  }
                  L11: {
                    L12: {
                      if (stackIn_55_0 != null) {
                        break L12;
                      } else {
                        fla.field_f.b((byte) -112, (vg) (Object) var6);
                        if (var9 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ln.a((vg) (Object) var7_ref, (vg) (Object) var6, (byte) 120);
                    break L11;
                  }
                  return;
                }
              }
            } else {
              L13: {
                if (null != bla.field_G) {
                  break L13;
                } else {
                  bla.field_G = new af(128);
                  tba.field_k = 0;
                  break L13;
                }
              }
              L14: {
                if (var1_ref.h(255) != 1) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L14;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L14;
                }
              }
              L15: {
                L16: {
                  var3_int = stackIn_11_0;
                  var4_ref_String = var1_ref.e((byte) -76);
                  if (var3_int != 0) {
                    break L16;
                  } else {
                    var5 = var4_ref_String;
                    if (var9 == 0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                var5 = var1_ref.e((byte) -76);
                break L15;
              }
              L17: {
                var6 = uh.a(var4_ref_String, -125);
                var7 = var1_ref.e((byte) -76);
                var8 = jd.a(1, (CharSequence) (Object) var4_ref_String);
                if (null == var8) {
                  var8 = var4_ref_String;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (null != var6) {
                  break L18;
                } else {
                  var6 = uh.a(var7, 48);
                  if (null != var6) {
                    bla.field_G.a(-1, (od) (Object) var6, (long)var8.hashCode());
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
              L19: {
                if (null != var6) {
                  break L19;
                } else {
                  var6 = new mu();
                  bla.field_G.a(-1, (od) (Object) var6, (long)var8.hashCode());
                  int fieldTemp$7 = tba.field_k;
                  tba.field_k = tba.field_k + 1;
                  var6.field_Db = fieldTemp$7;
                  wv.field_l.b((byte) -116, (vg) (Object) var6);
                  break L19;
                }
              }
              var6.field_yb = var5;
              var6.field_tb = var4_ref_String;
              var6.field_vb = var7;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "ri.N(" + 14180 + 41);
        }
    }

    final void a(byte param0, int param1) {
        try {
            ((ri) this).field_r = param1;
            if (param0 != -35) {
                ((ri) this).field_r = 106;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ri.FA(" + param0 + 44 + param1 + 41);
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
                  var2_int = ((ri) this).field_p / 2;
                  var4 = 18 / ((param0 - -69) / 42);
                  var3 = 0;
                  if (((ri) this).field_r <= 0) {
                    break L3;
                  } else {
                    if (((ri) this).field_o - -((ri) this).field_r < var2_int) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (((ri) this).field_r >= 0) {
                    break L4;
                  } else {
                    if (-var2_int < -((ri) this).field_r + ((ri) this).field_o) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  L6: {
                    if (((ri) this).field_r <= 0) {
                      break L6;
                    } else {
                      var3 = var2_int + -((ri) this).field_o;
                      if (var5 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var3 = var2_int + ((ri) this).field_o;
                  break L5;
                }
                ((ri) this).field_r = -((ri) this).field_r;
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var3 = ((ri) this).field_r;
              break L1;
            }
            ((ri) this).field_o = ((ri) this).field_o + var3;
            ((ri) this).field_n.c(false, var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "ri.H(" + param0 + 41);
        }
    }

    final void b(int param0) {
        try {
            if (param0 != 1) {
                field_q = 91;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ri.V(" + param0 + 41);
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
            ((ri) this).field_r = bla.a(true, 12, param1.b((byte) 44, 12));
            ((ri) this).field_p = oo.a(8, 8192, 0, param1.b((byte) 44, 8));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ri.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
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
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
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
                return stackIn_13_0;
              } else {
                stackOut_17_0 = var3_int;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "ri.M(" + param0 + 44 + 0 + 44 + param2 + 41);
        }
        return stackIn_18_0;
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
          throw tba.a((Throwable) (Object) var2, "ri.P(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final void a(boolean param0, int param1) {
        try {
            ((ri) this).field_p = param1;
            if (!param0) {
                ((ri) this).field_r = 121;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ri.DA(" + param0 + 44 + param1 + 41);
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
              param0.a((byte) -125, dqa.a(true, ((ri) this).field_r, 12), 12);
              param0.a((byte) 108, cn.a((byte) -127, ((ri) this).field_p, 8192, 8), 8);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ri.R(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    final static void a(java.awt.Component param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
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
            param0.addMouseListener((java.awt.event.MouseListener) (Object) wna.field_n);
            param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) wna.field_n);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) wna.field_n);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ri.O(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 1 + 41);
        }
    }

    final void c(byte param0) {
        try {
            super.c((byte) -121);
            ((ri) this).field_r = -((ri) this).field_r;
            ((ri) this).field_o = -((ri) this).field_o;
            if (param0 >= -116) {
                ((ri) this).a((kh) null, (byte) -85);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ri.L(" + param0 + 41);
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
            ((ri) this).field_r = 16;
            int discarded$3 = 8192;
            ((ri) this).field_p = cba.a((byte) -123, 90.0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ri.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
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
                ((ri) this).field_r = 54;
                break L1;
              }
            }
            param1 = fs.a((byte) 26, param1, ((ri) this).field_r);
            stackOut_3_0 = param1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "ri.Q(" + param0 + 44 + param1 + 41);
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
        Object stackIn_2_0 = null;
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
        Throwable decompiledCaughtException = null;
        nh stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
        Object stackOut_5_0 = null;
        try {
          var3 = nma.field_l;
          if (param1 < -59) {
            var4 = java.awt.Toolkit.getDefaultToolkit().createImage(param2);
            var5 = new java.awt.MediaTracker((java.awt.Component) (Object) nma.field_l);
            var5.addImage(var4, 0);
            var5.waitForAll();
            var6 = var4.getWidth((java.awt.image.ImageObserver) (Object) var3);
            var7 = var4.getHeight((java.awt.image.ImageObserver) (Object) var3);
            var8 = new int[var7 * var6];
            var9 = new java.awt.image.PixelGrabber(var4, 0, 0, var6, var7, var8, 0, var6);
            boolean discarded$2 = var9.grabPixels();
            stackOut_3_0 = param0.a(var8, var7, 122, var6, var6, 0);
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (nh) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L0: {
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref2;
            stackOut_7_1 = new StringBuilder().append("ri.EA(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L0;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L0;
            }
          }
          L1: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (InterruptedException) (Object) decompiledCaughtException;
          stackOut_5_0 = null;
          stackIn_6_0 = stackOut_5_0;
          return (nh) (Object) stackIn_6_0;
        }
    }

    static {
    }
}
