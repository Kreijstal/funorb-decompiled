/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pmb extends rqa {
    static phb[] field_o;
    static int field_p;

    pmb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2) {
        if (nob.field_o == null) {
          return -1;
        } else {
          if (cab.field_r <= param2) {
            if (nob.field_o.field_q + cab.field_r > param2) {
              L0: {
                if (param1 < qtb.field_p) {
                  break L0;
                } else {
                  if (nob.field_o.field_p + qtb.field_p <= param1) {
                    break L0;
                  } else {
                    return 0;
                  }
                }
              }
              if (param0 == -1) {
                L1: {
                  if (qr.field_g > param2) {
                    break L1;
                  } else {
                    if (param2 >= qr.field_g + nob.field_o.field_q) {
                      break L1;
                    } else {
                      if (mqa.field_q > param1) {
                        break L1;
                      } else {
                        if (nob.field_o.field_p + mqa.field_q <= param1) {
                          break L1;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
                return -1;
              } else {
                L2: {
                  int discarded$3 = pmb.a(109, -32, 51);
                  if (qr.field_g > param2) {
                    break L2;
                  } else {
                    if (param2 >= qr.field_g + nob.field_o.field_q) {
                      break L2;
                    } else {
                      if (mqa.field_q > param1) {
                        break L2;
                      } else {
                        if (nob.field_o.field_p + mqa.field_q <= param1) {
                          break L2;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
                return -1;
              }
            } else {
              if (param0 == -1) {
                L3: {
                  if (qr.field_g > param2) {
                    break L3;
                  } else {
                    if (param2 >= qr.field_g + nob.field_o.field_q) {
                      break L3;
                    } else {
                      if (mqa.field_q > param1) {
                        break L3;
                      } else {
                        if (nob.field_o.field_p + mqa.field_q <= param1) {
                          break L3;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
                return -1;
              } else {
                L4: {
                  int discarded$4 = pmb.a(109, -32, 51);
                  if (qr.field_g > param2) {
                    break L4;
                  } else {
                    if (param2 >= qr.field_g + nob.field_o.field_q) {
                      break L4;
                    } else {
                      if (mqa.field_q > param1) {
                        break L4;
                      } else {
                        if (nob.field_o.field_p + mqa.field_q <= param1) {
                          break L4;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
                return -1;
              }
            }
          } else {
            if (param0 == -1) {
              L5: {
                if (qr.field_g > param2) {
                  break L5;
                } else {
                  if (param2 >= qr.field_g + nob.field_o.field_q) {
                    break L5;
                  } else {
                    if (mqa.field_q > param1) {
                      break L5;
                    } else {
                      if (nob.field_o.field_p + mqa.field_q <= param1) {
                        break L5;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
              return -1;
            } else {
              int discarded$5 = pmb.a(109, -32, 51);
              if (qr.field_g <= param2) {
                if (param2 < qr.field_g + nob.field_o.field_q) {
                  if (mqa.field_q <= param1) {
                    if (nob.field_o.field_p + mqa.field_q > param1) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          }
        }
    }

    final static cp a(int param0, ds param1) {
        RuntimeException var2 = null;
        cp stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        cp stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = new cp(param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.c((byte) -77), param1.e((byte) -113));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("pmb.D(").append(126).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 < -119) {
              stackOut_3_0 = new nc((Object) (Object) frb.a(126, 108));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("pmb.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 1;
    }
}
