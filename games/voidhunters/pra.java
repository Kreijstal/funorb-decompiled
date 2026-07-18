/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pra extends rqa {
    static int field_o;
    static Object field_p;
    static String field_q;

    pra(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
            if (param1 <= -119) {
              stackOut_3_0 = new nc((Object) (Object) frb.a(59, 121));
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
            stackOut_5_1 = new StringBuilder().append("pra.A(");
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

    final static void a(boolean param0, boolean param1) {
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (param0) {
            wo.field_o = false;
            break L0;
          } else {
            if (null == lqa.field_o) {
              wo.field_o = false;
              break L0;
            } else {
              if (param0) {
                if (lia.field_b > 0) {
                  L1: {
                    lia.field_b = lia.field_b - 1;
                    if (param1) {
                      break L1;
                    } else {
                      pra.a(true, false);
                      break L1;
                    }
                  }
                  return;
                } else {
                  if (nf.field_a <= 0) {
                    if (tba.field_p > 0) {
                      L2: {
                        tba.field_p = tba.field_p - 1;
                        if (param1) {
                          break L2;
                        } else {
                          pra.a(true, false);
                          break L2;
                        }
                      }
                      return;
                    } else {
                      if (param1) {
                        return;
                      } else {
                        pra.a(true, false);
                        return;
                      }
                    }
                  } else {
                    L3: {
                      nf.field_a = nf.field_a - 1;
                      if (param1) {
                        break L3;
                      } else {
                        pra.a(true, false);
                        break L3;
                      }
                    }
                    return;
                  }
                }
              } else {
                L4: {
                  if (lqa.field_o != null) {
                    if (0 >= lia.field_b) {
                      if (nf.field_a <= 0) {
                        if (ldb.field_o > tba.field_p) {
                          if (tba.field_p != 0) {
                            L5: {
                              tba.field_p = tba.field_p + 1;
                              if (param1) {
                                break L5;
                              } else {
                                pra.a(true, false);
                                break L5;
                              }
                            }
                            return;
                          } else {
                            L6: {
                              ai.a(false, 0);
                              tba.field_p = tba.field_p + 1;
                              if (param1) {
                                break L6;
                              } else {
                                pra.a(true, false);
                                break L6;
                              }
                            }
                            return;
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        nf.field_a = nf.field_a - 1;
                        break L4;
                      }
                    } else {
                      lia.field_b = lia.field_b - 1;
                      break L4;
                    }
                  } else {
                    if (null != ohb.field_o) {
                      if (0 < lia.field_b) {
                        lia.field_b = lia.field_b - 1;
                        break L4;
                      } else {
                        if (0 < tba.field_p) {
                          tba.field_p = tba.field_p - 1;
                          break L4;
                        } else {
                          if (~nf.field_a > ~ldb.field_o) {
                            L7: {
                              if (nf.field_a == 0) {
                                ai.a(true, 0);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            nf.field_a = nf.field_a + 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    } else {
                      wo.field_o = false;
                      if (0 < nf.field_a) {
                        nf.field_a = nf.field_a - 1;
                        break L4;
                      } else {
                        if (tba.field_p <= 0) {
                          if (~lia.field_b > ~ldb.field_o) {
                            fma.l(8611);
                            lia.field_b = lia.field_b + 1;
                            break L4;
                          } else {
                            if (param1) {
                              return;
                            } else {
                              pra.a(true, false);
                              return;
                            }
                          }
                        } else {
                          tba.field_p = tba.field_p - 1;
                          break L4;
                        }
                      }
                    }
                  }
                }
                if (param1) {
                  return;
                } else {
                  pra.a(true, false);
                  return;
                }
              }
            }
          }
        }
        L8: {
          if (param0) {
            if (lia.field_b > 0) {
              lia.field_b = lia.field_b - 1;
              if (param1) {
                return;
              } else {
                pra.a(true, false);
                return;
              }
            } else {
              if (nf.field_a <= 0) {
                if (tba.field_p <= 0) {
                  break L8;
                } else {
                  tba.field_p = tba.field_p - 1;
                  if (param1) {
                    return;
                  } else {
                    pra.a(true, false);
                    return;
                  }
                }
              } else {
                nf.field_a = nf.field_a - 1;
                if (param1) {
                  return;
                } else {
                  pra.a(true, false);
                  return;
                }
              }
            }
          } else {
            if (lqa.field_o != null) {
              if (0 >= lia.field_b) {
                if (nf.field_a <= 0) {
                  if (ldb.field_o > tba.field_p) {
                    if (tba.field_p != 0) {
                      tba.field_p = tba.field_p + 1;
                      if (param1) {
                        return;
                      } else {
                        pra.a(true, false);
                        return;
                      }
                    } else {
                      ai.a(false, 0);
                      tba.field_p = tba.field_p + 1;
                      if (param1) {
                        return;
                      } else {
                        pra.a(true, false);
                        return;
                      }
                    }
                  } else {
                    break L8;
                  }
                } else {
                  nf.field_a = nf.field_a - 1;
                  break L8;
                }
              } else {
                lia.field_b = lia.field_b - 1;
                break L8;
              }
            } else {
              if (null != ohb.field_o) {
                if (0 < lia.field_b) {
                  lia.field_b = lia.field_b - 1;
                  break L8;
                } else {
                  if (0 < tba.field_p) {
                    tba.field_p = tba.field_p - 1;
                    break L8;
                  } else {
                    if (~nf.field_a > ~ldb.field_o) {
                      L9: {
                        if (nf.field_a == 0) {
                          ai.a(true, 0);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      nf.field_a = nf.field_a + 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              } else {
                wo.field_o = false;
                if (0 < nf.field_a) {
                  nf.field_a = nf.field_a - 1;
                  break L8;
                } else {
                  if (tba.field_p <= 0) {
                    if (~lia.field_b > ~ldb.field_o) {
                      fma.l(8611);
                      lia.field_b = lia.field_b + 1;
                      break L8;
                    } else {
                      if (param1) {
                        return;
                      } else {
                        pra.a(true, false);
                        return;
                      }
                    }
                  } else {
                    tba.field_p = tba.field_p - 1;
                    break L8;
                  }
                }
              }
            }
          }
        }
        if (param1) {
          return;
        } else {
          pra.a(true, false);
          return;
        }
    }

    public static void a(int param0) {
        field_q = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Ship blueprint recorded";
    }
}
