/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ik extends a implements df {
    private boolean field_db;
    static tf field_cb;
    private kg field_hb;
    private boolean field_jb;
    private boolean field_gb;
    private qe field_fb;
    static long[] field_ib;
    private boolean field_eb;

    final static String q(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_9_0 = null;
        String stackIn_19_0 = null;
        String stackIn_26_0 = null;
        String stackIn_36_0 = null;
        String stackOut_25_0 = null;
        String stackOut_35_0 = null;
        String stackOut_8_0 = null;
        String stackOut_18_0 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        var1 = "(" + bd.field_t + " " + nf.field_k + " " + dg.field_a + ") " + ca.field_e;
        if (param0 == 48) {
          if (tg.field_a > 0) {
            var1 = var1 + ":";
            var2 = 0;
            L0: while (true) {
              if (var2 < tg.field_a) {
                L1: {
                  stackOut_25_0 = var1 + 32;
                  stackIn_36_0 = stackOut_25_0;
                  stackIn_26_0 = stackOut_25_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        var1 = stackIn_26_0;
                        var3 = 255 & nf.field_l.field_g[var2];
                        var4 = var3 >> 4;
                        if (10 > var4) {
                          break L3;
                        } else {
                          var4 += 55;
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4 += 48;
                      break L2;
                    }
                    L4: {
                      L5: {
                        var3 = var3 & 15;
                        if (var3 < 10) {
                          break L5;
                        } else {
                          var3 += 55;
                          if (var5 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3 += 48;
                      break L4;
                    }
                    var1 = var1 + (char)var4;
                    var1 = var1 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      stackOut_35_0 = (String) var1;
                      stackIn_36_0 = stackOut_35_0;
                      break L1;
                    }
                  }
                }
                return stackIn_36_0;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        } else {
          field_cb = null;
          if (tg.field_a > 0) {
            var1 = var1 + ":";
            var2 = 0;
            L6: while (true) {
              if (var2 < tg.field_a) {
                L7: {
                  stackOut_8_0 = var1 + 32;
                  stackIn_19_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var5 != 0) {
                    break L7;
                  } else {
                    L8: {
                      L9: {
                        var1 = stackIn_9_0;
                        var3 = 255 & nf.field_l.field_g[var2];
                        var4 = var3 >> 4;
                        if (10 > var4) {
                          break L9;
                        } else {
                          var4 += 55;
                          if (var5 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var4 += 48;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var3 = var3 & 15;
                        if (var3 < 10) {
                          break L11;
                        } else {
                          var3 += 55;
                          if (var5 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var3 += 48;
                      break L10;
                    }
                    var1 = var1 + (char)var4;
                    var1 = var1 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L6;
                    } else {
                      stackOut_18_0 = (String) var1;
                      stackIn_19_0 = stackOut_18_0;
                      break L7;
                    }
                  }
                }
                return stackIn_19_0;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_4_0 = false;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var5_int = -121 % ((param2 - 65) / 55);
            if (param0 == 13) {
              ((ik) this).r(77);
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              stackOut_4_0 = super.a(param0, param1, (byte) 123, param3);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("ik.K(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_5_0;
    }

    final void t(int param0) {
        ((ik) this).field_fb.a(true, 4210752, param0);
        ee var2 = new ee((ik) this, ((ik) this).field_hb, cc.field_b);
        var2.a(lc.field_L, 15, 1);
        ((ik) this).b(-21, (qg) (Object) var2);
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException var4 = null;
        ee var4_ref = null;
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ee stackIn_12_0 = null;
        ee stackIn_13_0 = null;
        ee stackIn_14_0 = null;
        String stackIn_14_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ee stackOut_11_0 = null;
        ee stackOut_13_0 = null;
        String stackOut_13_1 = null;
        ee stackOut_12_0 = null;
        String stackOut_12_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (((ik) this).field_db) {
              return;
            } else {
              L1: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (param1 != 256) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              L2: {
                L3: {
                  ((ik) this).field_gb = stackIn_7_1 != 0;
                  ((ik) this).field_db = true;
                  ((ik) this).field_fb.a(true, 4210752, 8405024);
                  var4_ref = new ee((ik) this, ((ik) this).field_hb, param0);
                  if (5 != param1) {
                    break L3;
                  } else {
                    var4_ref.a(qb.field_a, 11, param2 + 5);
                    var4_ref.a(ta.field_b, 17, param2 + 5);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (param1 == 256) {
                    break L4;
                  } else {
                    L5: {
                      stackOut_11_0 = (ee) var4_ref;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (!((ik) this).field_eb) {
                        stackOut_13_0 = (ee) (Object) stackIn_13_0;
                        stackOut_13_1 = te.field_f;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L5;
                      } else {
                        stackOut_12_0 = (ee) (Object) stackIn_12_0;
                        stackOut_12_1 = rc.field_b;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L5;
                      }
                    }
                    ((ee) (Object) stackIn_14_0).a(stackIn_14_1, -1, 1);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                lj discarded$2 = var4_ref.a((ma) this, 8283, rc.field_b);
                break L2;
              }
              L6: {
                L7: {
                  if (~param1 == param2) {
                    break L7;
                  } else {
                    L8: {
                      if (param1 != 4) {
                        break L8;
                      } else {
                        var4_ref.a(ch.field_a, 8, 1);
                        if (var5 == 0) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (6 != param1) {
                        break L9;
                      } else {
                        var4_ref.a(ee.field_C, 9, param2 ^ -3);
                        if (var5 == 0) {
                          break L6;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (param1 != 9) {
                      break L6;
                    } else {
                      lj discarded$3 = var4_ref.a((ma) this, param2 + 8287, of.field_b);
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var4_ref.a(ad.field_f, 7, param2 + 5);
                break L6;
              }
              ((ik) this).b(-96, (qg) (Object) var4_ref);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("ik.C(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    ik(da param0, kg param1, String param2, boolean param3, boolean param4) {
        super(param0, (qg) (Object) new ee((ik) null, param1, param2), 77, 10, 10);
        try {
            ((ik) this).field_eb = param3 ? true : false;
            ((ik) this).field_gb = false;
            ((ik) this).field_jb = param4 ? true : false;
            ((ik) this).field_db = false;
            ((ik) this).field_hb = param1;
            ((ik) this).field_fb = new qe(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ik) this).field_fb.field_w = true;
            ((ik) this).a((qg) (Object) ((ik) this).field_fb, (byte) -88);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ik.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void s(int param0) {
        field_ib = null;
        field_cb = null;
        int var1 = -30 % ((param0 - 50) / 47);
    }

    final void r(int param0) {
        if (!((ik) this).field_A) {
          return;
        } else {
          ((ik) this).field_A = false;
          if (param0 == 77) {
            if (!((ik) this).field_eb) {
              if (!((ik) this).field_jb) {
                return;
              } else {
                ff.a((byte) -124);
                return;
              }
            } else {
              ai.b(param0 + -202);
              if (Transmogrify.field_A) {
                L0: {
                  if (((ik) this).field_jb) {
                    ff.a((byte) -124);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            ((ik) this).r(-69);
            if (((ik) this).field_eb) {
              ai.b(param0 + -202);
              if (!Transmogrify.field_A) {
                return;
              } else {
                L1: {
                  if (((ik) this).field_jb) {
                    ff.a((byte) -124);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            } else {
              L2: {
                if (((ik) this).field_jb) {
                  ff.a((byte) -124);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          }
        }
    }

    final static ti[] a(String param0, ci param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ti[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ti[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -15) {
                break L1;
              } else {
                field_cb = null;
                break L1;
              }
            }
            var4_int = param1.b(81, param0);
            var5 = param1.a(-1, param3, var4_int);
            stackOut_2_0 = cc.a(var5, param1, -42, var4_int);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ik.EA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    public void a(lj param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 17) {
                break L1;
              } else {
                ((ik) this).field_jb = false;
                break L1;
              }
            }
            L2: {
              if (!((ik) this).field_gb) {
                break L2;
              } else {
                ba.a(123, 3);
                ((ik) this).r(77);
                if (!Transmogrify.field_A) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            ia.a(ha.b(105), 6, "tochangedisplayname.ws");
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("ik.MA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = new tf(14, 0, 4, 1);
        field_ib = new long[32];
    }
}
