/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class se extends li implements ho {
    static long field_f;
    static String field_g;
    private ga field_h;

    final static void a(byte param0, boolean param1, int param2) {
        fa.a((vc) (Object) gj.field_m, (vc) (Object) go.field_l, true, param1, r.field_m ? 280 : 480, 5, 20, 15, 26, 240, h.field_d, af.field_c, 0, param2, r.field_m ? 240 : 320, 20, 17);
        int var3 = -117 / ((param0 - -6) / 42);
    }

    public static void d(byte param0) {
        field_g = null;
    }

    final String a(boolean param0) {
        if (param0) {
            return null;
        }
        return ((se) this).a(((se) this).field_h.field_o, 114);
    }

    final oi b(int param0) {
        if (param0 != 51) {
            return null;
        }
        return ((se) this).a(((se) this).field_h.field_o, (byte) -122);
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = CrazyCrystals.field_B;
        ci.field_k = null;
        jh.field_e = 0;
        so.field_c = null;
        var2 = cb.field_m;
        if (param1 <= -99) {
          cb.field_m = CrazyCrystals.field_D;
          oi.field_d.field_j = oi.field_d.field_j + 1;
          CrazyCrystals.field_D = var2;
          if (param0 != 51) {
            if (50 == param0) {
              L0: {
                oi.field_d.field_p = 5;
                if (oi.field_d.field_j < 2) {
                  break L0;
                } else {
                  if (param0 != 51) {
                    break L0;
                  } else {
                    return 2;
                  }
                }
              }
              L1: {
                if (oi.field_d.field_j < 2) {
                  break L1;
                } else {
                  if (param0 != 50) {
                    break L1;
                  } else {
                    return 5;
                  }
                }
              }
              if (4 > oi.field_d.field_j) {
                return -1;
              } else {
                return 1;
              }
            } else {
              L2: {
                oi.field_d.field_p = 1;
                if (oi.field_d.field_j < 2) {
                  break L2;
                } else {
                  if (param0 != 51) {
                    break L2;
                  } else {
                    return 2;
                  }
                }
              }
              L3: {
                if (oi.field_d.field_j < 2) {
                  break L3;
                } else {
                  if (param0 != 50) {
                    break L3;
                  } else {
                    return 5;
                  }
                }
              }
              if (4 > oi.field_d.field_j) {
                return -1;
              } else {
                return 1;
              }
            }
          } else {
            L4: {
              oi.field_d.field_p = 2;
              if (oi.field_d.field_j < 2) {
                break L4;
              } else {
                if (param0 != 51) {
                  break L4;
                } else {
                  return 2;
                }
              }
            }
            L5: {
              if (oi.field_d.field_j < 2) {
                break L5;
              } else {
                if (param0 != 50) {
                  break L5;
                } else {
                  return 5;
                }
              }
            }
            if (4 > oi.field_d.field_j) {
              return -1;
            } else {
              return 1;
            }
          }
        } else {
          int discarded$1 = se.a(-41, (byte) -4);
          cb.field_m = CrazyCrystals.field_D;
          oi.field_d.field_j = oi.field_d.field_j + 1;
          CrazyCrystals.field_D = var2;
          if (param0 != 51) {
            if (50 == param0) {
              oi.field_d.field_p = 5;
              if (oi.field_d.field_j >= 2) {
                if (param0 == 51) {
                  return 2;
                } else {
                  L6: {
                    if (oi.field_d.field_j < 2) {
                      break L6;
                    } else {
                      if (param0 != 50) {
                        break L6;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (4 > oi.field_d.field_j) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              } else {
                L7: {
                  if (oi.field_d.field_j < 2) {
                    break L7;
                  } else {
                    if (param0 != 50) {
                      break L7;
                    } else {
                      return 5;
                    }
                  }
                }
                if (4 > oi.field_d.field_j) {
                  return -1;
                } else {
                  return 1;
                }
              }
            } else {
              oi.field_d.field_p = 1;
              if (oi.field_d.field_j >= 2) {
                if (param0 == 51) {
                  return 2;
                } else {
                  L8: {
                    if (oi.field_d.field_j < 2) {
                      break L8;
                    } else {
                      if (param0 != 50) {
                        break L8;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (4 > oi.field_d.field_j) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              } else {
                L9: {
                  if (oi.field_d.field_j < 2) {
                    break L9;
                  } else {
                    if (param0 != 50) {
                      break L9;
                    } else {
                      return 5;
                    }
                  }
                }
                if (4 > oi.field_d.field_j) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            oi.field_d.field_p = 2;
            if (oi.field_d.field_j >= 2) {
              if (param0 == 51) {
                return 2;
              } else {
                L10: {
                  if (oi.field_d.field_j < 2) {
                    break L10;
                  } else {
                    if (param0 != 50) {
                      break L10;
                    } else {
                      return 5;
                    }
                  }
                }
                if (4 > oi.field_d.field_j) {
                  return -1;
                } else {
                  return 1;
                }
              }
            } else {
              if (oi.field_d.field_j >= 2) {
                if (param0 == 50) {
                  return 5;
                } else {
                  if (4 > oi.field_d.field_j) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              } else {
                if (4 > oi.field_d.field_j) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          }
        }
    }

    abstract String a(String param0, int param1);

    public final boolean a(byte param0) {
        Object var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -41) {
          if (((se) this).field_h.field_o != null) {
            if (0 == ((se) this).field_h.field_o.length()) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          var3 = null;
          ((se) this).a((ga) null, -13);
          if (((se) this).field_h.field_o == null) {
            return true;
          } else {
            L0: {
              if (0 != ((se) this).field_h.field_o.length()) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    abstract oi a(String param0, byte param1);

    public final void a(int param0, ga param1) {
        try {
            int var3_int = -104 / ((param0 - -20) / 46);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "se.U(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    se(ga param0) {
        try {
            ((se) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "se.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(ga param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param1 != -29513) {
                field_f = -69L;
                ((se) this).b((byte) 78);
                break L1;
              } else {
                ((se) this).b((byte) 78);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("se.DA(");
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Done";
    }
}
