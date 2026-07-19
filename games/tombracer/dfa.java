/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dfa {
    static java.applet.Applet field_e;
    static String field_a;
    static gb field_b;
    int field_d;
    int field_c;

    final static boolean a(int param0, boolean param1, int param2) {
        int var3 = 0;
        String var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (null == ifa.field_n) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (fna.field_h != 9) {
          if ((fna.field_h ^ -1) != -11) {
            if (!param1) {
              if (fna.field_h != 11) {
                return false;
              } else {
                if (ns.field_f) {
                  L1: {
                    if (-3 != (gm.field_n ^ -1)) {
                      break L1;
                    } else {
                      if (ota.a(apa.field_a, (byte) 13, cr.field_b)) {
                        break L1;
                      } else {
                        return false;
                      }
                    }
                  }
                  L2: {
                    if (2 == gm.field_n) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        break L2;
                      } else {
                        return false;
                      }
                    }
                  }
                  L3: {
                    if (oj.i(-1)) {
                      var4 = (String) null;
                      opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              field_e = (java.applet.Applet) null;
              if (fna.field_h != 11) {
                return false;
              } else {
                if (ns.field_f) {
                  L4: {
                    if (-3 != (gm.field_n ^ -1)) {
                      break L4;
                    } else {
                      if (ota.a(apa.field_a, (byte) 13, cr.field_b)) {
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  L5: {
                    if (2 == gm.field_n) {
                      break L5;
                    } else {
                      if (var3 == 0) {
                        break L5;
                      } else {
                        return false;
                      }
                    }
                  }
                  L6: {
                    if (oj.i(-1)) {
                      var4 = (String) null;
                      opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  return true;
                } else {
                  return false;
                }
              }
            }
          } else {
            if (var3 != 0) {
              return false;
            } else {
              ola.e((byte) 113);
              return true;
            }
          }
        } else {
          if (sqa.a(uba.field_f, 110, fp.field_d, tba.field_g, bla.field_I)) {
            L7: {
              if (-3 == (uba.field_f ^ -1)) {
                break L7;
              } else {
                if (var3 == 0) {
                  break L7;
                } else {
                  return false;
                }
              }
            }
            return eca.a((byte) -121, uba.field_f, bla.field_I, fp.field_d, tba.field_g);
          } else {
            if ((fna.field_h ^ -1) != -11) {
              if (param1) {
                field_e = (java.applet.Applet) null;
                if (fna.field_h == 11) {
                  if (ns.field_f) {
                    L8: {
                      if (-3 != (gm.field_n ^ -1)) {
                        break L8;
                      } else {
                        if (ota.a(apa.field_a, (byte) 13, cr.field_b)) {
                          break L8;
                        } else {
                          return false;
                        }
                      }
                    }
                    L9: {
                      if (2 == gm.field_n) {
                        break L9;
                      } else {
                        if (var3 == 0) {
                          break L9;
                        } else {
                          return false;
                        }
                      }
                    }
                    L10: {
                      if (oj.i(-1)) {
                        var4 = (String) null;
                        opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (fna.field_h == 11) {
                  if (ns.field_f) {
                    if (-3 == (gm.field_n ^ -1)) {
                      if (!ota.a(apa.field_a, (byte) 13, cr.field_b)) {
                        return false;
                      } else {
                        L11: {
                          if (2 == gm.field_n) {
                            break L11;
                          } else {
                            if (var3 == 0) {
                              break L11;
                            } else {
                              return false;
                            }
                          }
                        }
                        L12: {
                          if (oj.i(-1)) {
                            var4 = (String) null;
                            opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        return true;
                      }
                    } else {
                      if (2 != gm.field_n) {
                        if (var3 != 0) {
                          return false;
                        } else {
                          L13: {
                            if (oj.i(-1)) {
                              var4 = (String) null;
                              opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          return true;
                        }
                      } else {
                        L14: {
                          if (oj.i(-1)) {
                            var4 = (String) null;
                            opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        return true;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            } else {
              if (var3 != 0) {
                return false;
              } else {
                ola.e((byte) 113);
                return true;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        L0: {
          var3 = 118 % ((24 - param2) / 41);
          if (-1 >= (param0 ^ -1)) {
            break L0;
          } else {
            param0 = param1 + param0 % param1;
            break L0;
          }
        }
        if (param0 >= param1) {
          return param0 % param1;
        } else {
          return param0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        String discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param1 >= param2) {
                    break L3;
                  } else {
                    var5_int = param1;
                    L4: while (true) {
                      if (param2 <= var5_int) {
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        vaa.field_a[var5_int][param0] = param3;
                        var5_int++;
                        if (var6 != 0) {
                          break L2;
                        } else {
                          continue L4;
                        }
                      }
                    }
                  }
                }
                var5_int = param2;
                L5: while (true) {
                  if (param1 <= var5_int) {
                    break L2;
                  } else {
                    vaa.field_a[var5_int][param0] = param3;
                    var5_int++;
                    if (var6 != 0) {
                      break L1;
                    } else {
                      continue L5;
                    }
                  }
                }
              }
              if (param4 == 0) {
                break L1;
              } else {
                var7 = (String) null;
                discarded$1 = dfa.a('N', (String) null, (String) null, 30);
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var5), "dfa.FC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void c(byte param0) {
        boolean discarded$12 = false;
        L0: {
          og.b(0);
          if (null != nma.field_l) {
            pq.a(nma.field_l, false);
            break L0;
          } else {
            break L0;
          }
        }
        ola.f((byte) 101);
        pc.a(5);
        if (param0 != 62) {
          L1: {
            discarded$12 = dfa.a(-50, false, 79);
            rda.e(0);
            if (bl.b(param0 + -62)) {
              ql.field_k.k(1, -2988);
              bl.a(0, -1);
              break L1;
            } else {
              break L1;
            }
          }
          dea.a(60);
          return;
        } else {
          L2: {
            rda.e(0);
            if (bl.b(param0 + -62)) {
              ql.field_k.k(1, -2988);
              bl.a(0, -1);
              break L2;
            } else {
              break L2;
            }
          }
          dea.a(60);
          return;
        }
    }

    abstract boolean b(int param0);

    abstract void a(byte param0, boolean param1);

    abstract void a(boolean param0, boolean param1, int param2);

    public static void b(byte param0) {
        field_b = null;
        if (param0 != -104) {
            field_b = (gb) null;
            field_e = null;
            field_a = null;
            return;
        }
        field_e = null;
        field_a = null;
    }

    abstract void a(int param0);

    final static String a(char param0, String param1, String param2, int param3) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              var5 = param1.length();
              var6 = var4_int;
              var7 = var5 + -1;
              if (param3 != var7) {
                var8_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      var8_int = param2.indexOf((int) param0, var8_int);
                      if (-1 >= (var8_int ^ -1)) {
                        break L4;
                      } else {
                        if (var11 != 0) {
                          break L3;
                        } else {
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var8_int++;
                    var6 = var6 + var7;
                    break L3;
                  }
                  if (var11 == 0) {
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  var10 = param2.indexOf((int) param0, var9);
                  if (var10 < 0) {
                    break L7;
                  } else {
                    discarded$6 = var8.append(param2.substring(var9, var10));
                    var9 = var10 + 1;
                    discarded$7 = var8.append(param1);
                    if (var11 != 0) {
                      break L6;
                    } else {
                      if (var11 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                discarded$8 = var8.append(param2.substring(var9));
                break L6;
              }
              stackOut_16_0 = var8.toString();
              stackIn_17_0 = stackOut_16_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("dfa.EC(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          L9: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ')');
        }
        return stackIn_17_0;
    }

    abstract boolean a(int param0, char param1, int param2);

    abstract void a(byte param0);

    dfa(int param0) {
        this.field_c = param0;
        this.field_d = this.field_c;
    }

    static {
        field_a = "Bruce";
        field_b = new gb();
    }
}
