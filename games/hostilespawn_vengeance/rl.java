/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String field_a;
    static bd field_d;
    static int field_c;
    static int field_b;

    public static void a() {
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          m.field_q = param5;
          qh.field_e = param3;
          ni.field_f = param6;
          qg.field_n = param4;
          if (-param2 + qh.field_e > -param1 + qg.field_n) {
            stackOut_2_0 = -param1 + qg.field_n;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = qh.field_e + -param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          v.field_g = stackIn_3_0;
          if (m.field_q + param1 <= param2 + ni.field_f) {
            stackOut_5_0 = param2 + ni.field_f;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = m.field_q + param1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          cn.field_r = stackIn_6_0;
          if (qg.field_n - -param1 <= param2 + qh.field_e) {
            stackOut_8_0 = param2 + qh.field_e;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = param1 + qg.field_n;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          bn.field_p = stackIn_9_0;
          if (-param1 + m.field_q >= ni.field_f + -param2) {
            stackOut_11_0 = -param2 + ni.field_f;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = m.field_q - param1;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        pk.field_m = stackIn_12_0;
        if (si.field_j << 2 > v.field_g) {
          if (si.field_j << 2 <= bn.field_p) {
            v.field_g = si.field_j << 2;
            if (bn.field_p > si.field_a << 2) {
              bn.field_p = si.field_a << 2;
              if (v.field_g <= si.field_a << 2) {
                L4: {
                  if (si.field_b << 2 > pk.field_m) {
                    L5: {
                      if (cn.field_r < si.field_b << 2) {
                        cn.field_r = si.field_b << 2;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    pk.field_m = si.field_b << 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (cn.field_r <= si.field_l << 2) {
                    break L6;
                  } else {
                    L7: {
                      if (si.field_l << 2 < pk.field_m) {
                        pk.field_m = si.field_l << 2;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    cn.field_r = si.field_l << 2;
                    break L6;
                  }
                }
                return;
              } else {
                L8: {
                  v.field_g = si.field_a << 2;
                  if (si.field_b << 2 > pk.field_m) {
                    L9: {
                      if (cn.field_r < si.field_b << 2) {
                        cn.field_r = si.field_b << 2;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    pk.field_m = si.field_b << 2;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L10: {
                  if (cn.field_r <= si.field_l << 2) {
                    break L10;
                  } else {
                    L11: {
                      if (si.field_l << 2 < pk.field_m) {
                        pk.field_m = si.field_l << 2;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    cn.field_r = si.field_l << 2;
                    break L10;
                  }
                }
                return;
              }
            } else {
              L12: {
                if (si.field_b << 2 > pk.field_m) {
                  L13: {
                    if (cn.field_r < si.field_b << 2) {
                      cn.field_r = si.field_b << 2;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  pk.field_m = si.field_b << 2;
                  break L12;
                } else {
                  break L12;
                }
              }
              L14: {
                if (cn.field_r <= si.field_l << 2) {
                  break L14;
                } else {
                  L15: {
                    if (si.field_l << 2 < pk.field_m) {
                      pk.field_m = si.field_l << 2;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  cn.field_r = si.field_l << 2;
                  break L14;
                }
              }
              return;
            }
          } else {
            bn.field_p = si.field_j << 2;
            v.field_g = si.field_j << 2;
            if (bn.field_p > si.field_a << 2) {
              bn.field_p = si.field_a << 2;
              if (v.field_g > si.field_a << 2) {
                L16: {
                  v.field_g = si.field_a << 2;
                  if (si.field_b << 2 > pk.field_m) {
                    L17: {
                      if (cn.field_r < si.field_b << 2) {
                        cn.field_r = si.field_b << 2;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    pk.field_m = si.field_b << 2;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L18: {
                  if (cn.field_r <= si.field_l << 2) {
                    break L18;
                  } else {
                    L19: {
                      if (si.field_l << 2 < pk.field_m) {
                        pk.field_m = si.field_l << 2;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    cn.field_r = si.field_l << 2;
                    break L18;
                  }
                }
                return;
              } else {
                L20: {
                  if (si.field_b << 2 > pk.field_m) {
                    L21: {
                      if (cn.field_r < si.field_b << 2) {
                        cn.field_r = si.field_b << 2;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    pk.field_m = si.field_b << 2;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L22: {
                  if (cn.field_r <= si.field_l << 2) {
                    break L22;
                  } else {
                    L23: {
                      if (si.field_l << 2 < pk.field_m) {
                        pk.field_m = si.field_l << 2;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    cn.field_r = si.field_l << 2;
                    break L22;
                  }
                }
                return;
              }
            } else {
              L24: {
                if (si.field_b << 2 > pk.field_m) {
                  L25: {
                    if (cn.field_r < si.field_b << 2) {
                      cn.field_r = si.field_b << 2;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  pk.field_m = si.field_b << 2;
                  break L24;
                } else {
                  break L24;
                }
              }
              L26: {
                if (cn.field_r <= si.field_l << 2) {
                  break L26;
                } else {
                  L27: {
                    if (si.field_l << 2 < pk.field_m) {
                      pk.field_m = si.field_l << 2;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  cn.field_r = si.field_l << 2;
                  break L26;
                }
              }
              return;
            }
          }
        } else {
          if (bn.field_p > si.field_a << 2) {
            bn.field_p = si.field_a << 2;
            if (v.field_g <= si.field_a << 2) {
              L28: {
                if (si.field_b << 2 > pk.field_m) {
                  L29: {
                    if (cn.field_r < si.field_b << 2) {
                      cn.field_r = si.field_b << 2;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  pk.field_m = si.field_b << 2;
                  break L28;
                } else {
                  break L28;
                }
              }
              L30: {
                if (cn.field_r <= si.field_l << 2) {
                  break L30;
                } else {
                  L31: {
                    if (si.field_l << 2 < pk.field_m) {
                      pk.field_m = si.field_l << 2;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  cn.field_r = si.field_l << 2;
                  break L30;
                }
              }
              return;
            } else {
              v.field_g = si.field_a << 2;
              L32: {
                if (si.field_b << 2 > pk.field_m) {
                  L33: {
                    if (cn.field_r < si.field_b << 2) {
                      cn.field_r = si.field_b << 2;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  pk.field_m = si.field_b << 2;
                  break L32;
                } else {
                  break L32;
                }
              }
              L34: {
                if (cn.field_r <= si.field_l << 2) {
                  break L34;
                } else {
                  L35: {
                    if (si.field_l << 2 < pk.field_m) {
                      pk.field_m = si.field_l << 2;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  cn.field_r = si.field_l << 2;
                  break L34;
                }
              }
              return;
            }
          } else {
            L36: {
              if (si.field_b << 2 > pk.field_m) {
                L37: {
                  if (cn.field_r < si.field_b << 2) {
                    cn.field_r = si.field_b << 2;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                pk.field_m = si.field_b << 2;
                break L36;
              } else {
                break L36;
              }
            }
            L38: {
              if (cn.field_r <= si.field_l << 2) {
                break L38;
              } else {
                L39: {
                  if (si.field_l << 2 < pk.field_m) {
                    pk.field_m = si.field_l << 2;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                cn.field_r = si.field_l << 2;
                break L38;
              }
            }
            return;
          }
        }
    }

    final static void a(int param0, ic param1) {
        en var3 = null;
        try {
            var3 = s.field_b;
            var3.i(19319, 3);
            var3.d(103, 5);
            var3.d(122, 0);
            var3.a((byte) -118, param1.field_j);
            var3.d(105, param1.field_q);
            var3.d(80, param1.field_h);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "rl.B(" + 3 + ',' + (param1 != null ? "{...}" : "null") + ',' + 746037954 + ')');
        }
    }

    final static boolean a(int param0, gb param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            var5 = param1.a(false, param3, param2);
            var4 = var5;
            if (var5 != null) {
              jh.a(-26869, var5);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("rl.A(").append(2884).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Use the function<nbsp>keys or ctrl<nbsp>+<nbsp>number to<nbsp>select your secondary weapon, or right-click on the weapon in your HUD.";
        field_c = 0;
    }
}
