/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class epa extends wv {
    static int[] field_r;
    static String field_q;

    final int e(int param0, int param1) {
        if (param1 < 121) {
            return -92;
        }
        if (!(5 <= param0)) {
            return 100;
        }
        return cq.field_d.field_k + cq.field_d.field_w;
    }

    epa(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void d(int param0) {
        if (param0 != 2) {
            epa.d(10);
            field_q = null;
            field_r = null;
            return;
        }
        field_q = null;
        field_r = null;
    }

    final int g(int param0, int param1) {
        if (!(param0 >= 3)) {
            return -cq.field_d.field_w + ((epa) this).field_n;
        }
        if (param1 != 30) {
            field_r = null;
            if (!(param0 >= 5)) {
                return ((epa) this).field_n - -((epa) this).e(0, 125) - cq.field_d.field_w;
            }
            return (param0 > 4 ? 30 : -1 + ((epa) this).field_m.length == param0 ? 60 : 30) + -cq.field_d.field_w + (((epa) this).field_n + (-2 + param0) * ((epa) this).field_i);
        }
        if (!(param0 >= 5)) {
            return ((epa) this).field_n - -((epa) this).e(0, 125) - cq.field_d.field_w;
        }
        return (param0 > 4 ? 30 : -1 + ((epa) this).field_m.length == param0 ? 60 : 30) + -cq.field_d.field_w + (((epa) this).field_n + (-2 + param0) * ((epa) this).field_i);
    }

    final static void a(int param0, byte param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -84) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            L2: {
              gj.field_r = false;
              nfa.field_p = false;
              if (ci.field_l == null) {
                break L2;
              } else {
                if (!ci.field_l.field_B) {
                  break L2;
                } else {
                  L3: {
                    var3_int = 1;
                    if (param0 != 8) {
                      break L3;
                    } else {
                      L4: {
                        if (jf.field_r) {
                          param2 = nda.field_d;
                          break L4;
                        } else {
                          param2 = ria.field_n;
                          break L4;
                        }
                      }
                      param0 = 2;
                      vn.field_b.a(jo.field_E, 123);
                      break L3;
                    }
                  }
                  L5: {
                    if (param0 == 10) {
                      ka.a((byte) -33);
                      var3_int = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (var3_int != 0) {
                      L7: {
                        if (gj.field_r) {
                          param2 = gl.a((byte) 94, nka.field_a, new String[1]);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (bga.field_d) {
                          param2 = mj.field_K;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      ci.field_l.a(param0, (byte) 94, param2);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (param0 == 256) {
                    break L2;
                  } else {
                    if (10 != param0) {
                      if (jf.field_r) {
                        break L2;
                      } else {
                        vn.field_b.a((byte) -92);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("epa.CA(").append(param0).append(44).append(param1).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
    }

    final static en d(byte param0) {
        return kva.field_n;
    }

    final int a(int param0, byte param1) {
        if (param1 == -48) {
          if (param0 == 0) {
            return -110 + ((epa) this).field_f;
          } else {
            if (param0 != 1) {
              if (2 == param0) {
                return ((epa) this).field_f - -60;
              } else {
                if (3 == param0) {
                  return -80 + ((epa) this).field_f;
                } else {
                  if (4 != param0) {
                    if (param0 != 6) {
                      if (7 == param0) {
                        return ((epa) this).field_f - 10;
                      } else {
                        return ((epa) this).field_f;
                      }
                    } else {
                      return ((epa) this).field_f - 10;
                    }
                  } else {
                    return ((epa) this).field_f - -30;
                  }
                }
              }
            } else {
              return ((epa) this).field_f + -25;
            }
          }
        } else {
          field_r = null;
          if (param0 == 0) {
            return -110 + ((epa) this).field_f;
          } else {
            if (param0 != 1) {
              if (2 == param0) {
                return ((epa) this).field_f - -60;
              } else {
                if (3 == param0) {
                  return -80 + ((epa) this).field_f;
                } else {
                  if (4 != param0) {
                    if (param0 != 6) {
                      if (7 == param0) {
                        return ((epa) this).field_f - 10;
                      } else {
                        return ((epa) this).field_f;
                      }
                    } else {
                      return ((epa) this).field_f - 10;
                    }
                  } else {
                    return ((epa) this).field_f - -30;
                  }
                }
              }
            } else {
              return ((epa) this).field_f + -25;
            }
          }
        }
    }

    final int a(byte param0, int param1) {
        if (param1 == 0) {
          return ((epa) this).field_g + -80;
        } else {
          if (param1 != 1) {
            if (param0 >= 111) {
              if (param1 != 2) {
                if (param1 != 3) {
                  if (4 == param1) {
                    return ((epa) this).field_g - -60;
                  } else {
                    if (param1 != 6) {
                      if (param1 == 7) {
                        return ((epa) this).field_g + -10;
                      } else {
                        return ((epa) this).field_g;
                      }
                    } else {
                      return ((epa) this).field_g + -10;
                    }
                  }
                } else {
                  return -50 + ((epa) this).field_g;
                }
              } else {
                return 90 + ((epa) this).field_g;
              }
            } else {
              return -91;
            }
          } else {
            return 5 + ((epa) this).field_g;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Change display name";
        field_r = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
