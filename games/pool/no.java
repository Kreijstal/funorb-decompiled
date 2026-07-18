/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class no {
    wo field_j;
    static na field_k;
    static int[] field_s;
    static nl field_h;
    wo field_f;
    static dd field_q;
    wo field_t;
    static int[] field_n;
    static hj field_g;
    wo field_o;
    ge field_r;
    long field_d;
    int field_m;
    static String field_b;
    static int field_l;
    ge field_p;
    volatile int field_a;
    byte field_c;
    volatile int field_e;
    sp field_i;

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -125) {
          L0: {
            boolean discarded$10 = ((no) this).d(-57);
            if (20 > ((no) this).c(param0 + 4734)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (20 > ((no) this).c(param0 + 4734)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    abstract boolean d(int param0);

    abstract void a(int param0, boolean param1, Object param2);

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 20) {
          L0: {
            int discarded$10 = ((no) this).c(-49);
            if (20 > ((no) this).a(false)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (20 > ((no) this).a(false)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    abstract void a(byte param0);

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        long var18 = 0L;
        long var20 = 0L;
        long var22 = 0L;
        long var24 = 0L;
        int var26 = 0;
        int var27 = 0;
        L0: {
          var12 = param2 + -param4;
          var13 = param0 + -param6;
          if (var12 != 0) {
            break L0;
          } else {
            if (var13 != 0) {
              break L0;
            } else {
              return -1;
            }
          }
        }
        var14 = -param9 + param7;
        var15 = -param10 + param5;
        if (aj.a(var14, false, var12) - -aj.a(var15, false, var13) > 0) {
          return -1;
        } else {
          if (~param3 < ~param1) {
            param9 = param9 + aj.a(-param1 + param3, false, param4);
            param10 = param10 + aj.a(param3 + -param1, false, param6);
            param1 = param3;
            var15 = param5 - param10;
            var14 = param7 + -param9;
            var16 = 256;
            var17 = aj.a(var12, false, var12) - -aj.a(var13, false, var13);
            if (var17 != 0) {
              L1: {
                var18 = 2L * (od.a((long)var14, (long)var12, false) - -od.a((long)var15, (long)var13, false));
                if (var18 > 2147483647L) {
                  break L1;
                } else {
                  if (-2147483648L > var18) {
                    break L1;
                  } else {
                    L2: {
                      if ((var14 >> 16) * (var14 >> 16) > 2147483647) {
                        break L2;
                      } else {
                        if (2147483647 < (var15 >> 16) * (var15 >> 16)) {
                          break L2;
                        } else {
                          var20 = od.a((long)var14, (long)var14, false) - -od.a((long)var15, (long)var15, false) + -(long)(var16 << 16);
                          var22 = od.a(var18, var18, false) + -(4L * od.a((long)var17, var20, false));
                          if (0L <= var22) {
                            var24 = bm.a(-107, var22);
                            if (var24 > 2147483647L) {
                              throw new IllegalStateException("Out of range: 0x" + Long.toString(var24, 16));
                            } else {
                              if (var24 >= -2147483648L) {
                                L3: {
                                  var26 = (int)((-var18 - -var24 << 15) / (long)var17);
                                  var27 = (int)((-var18 + -var24 << 15) / (long)var17);
                                  if (var26 <= 0) {
                                    break L3;
                                  } else {
                                    if (65536 + -param1 < var26) {
                                      break L3;
                                    } else {
                                      if (var26 > var27) {
                                        break L3;
                                      } else {
                                        return var26 - -param1;
                                      }
                                    }
                                  }
                                }
                                if (var27 <= 0) {
                                  if (var26 > 0) {
                                    L4: {
                                      if (var27 > 0) {
                                        break L4;
                                      } else {
                                        if (var26 <= 0) {
                                          break L4;
                                        } else {
                                          return 1 + param1;
                                        }
                                      }
                                    }
                                    return -1;
                                  } else {
                                    if (0 < var27) {
                                      return 1 + param1;
                                    } else {
                                      L5: {
                                        if (var27 > 0) {
                                          break L5;
                                        } else {
                                          if (var26 <= 0) {
                                            break L5;
                                          } else {
                                            return 1 + param1;
                                          }
                                        }
                                      }
                                      return -1;
                                    }
                                  }
                                } else {
                                  if (65536 - param1 >= var27) {
                                    return param1 + var27;
                                  } else {
                                    if (var26 > 0) {
                                      L6: {
                                        if (var27 > 0) {
                                          break L6;
                                        } else {
                                          if (var26 <= 0) {
                                            break L6;
                                          } else {
                                            return 1 + param1;
                                          }
                                        }
                                      }
                                      return -1;
                                    } else {
                                      if (0 < var27) {
                                        return 1 + param1;
                                      } else {
                                        L7: {
                                          if (var27 > 0) {
                                            break L7;
                                          } else {
                                            if (var26 <= 0) {
                                              break L7;
                                            } else {
                                              return 1 + param1;
                                            }
                                          }
                                        }
                                        return -1;
                                      }
                                    }
                                  }
                                }
                              } else {
                                throw new IllegalStateException("Out of range: 0x" + Long.toString(var24, 16));
                              }
                            }
                          } else {
                            return -1;
                          }
                        }
                      }
                    }
                    return -1;
                  }
                }
              }
              return -1;
            } else {
              return -1;
            }
          } else {
            if (param1 > param3) {
              param7 = param7 + aj.a(-param3 + param1, false, param2);
              param5 = param5 + aj.a(-param3 + param1, false, param0);
              param3 = param1;
              var14 = param7 - param9;
              var15 = param5 + -param10;
              var16 = 256;
              var17 = aj.a(var12, false, var12) - -aj.a(var13, false, var13);
              if (var17 != 0) {
                L8: {
                  var18 = 2L * (od.a((long)var14, (long)var12, false) - -od.a((long)var15, (long)var13, false));
                  if (var18 > 2147483647L) {
                    break L8;
                  } else {
                    if (-2147483648L > var18) {
                      break L8;
                    } else {
                      L9: {
                        if ((var14 >> 16) * (var14 >> 16) > 2147483647) {
                          break L9;
                        } else {
                          if (2147483647 < (var15 >> 16) * (var15 >> 16)) {
                            break L9;
                          } else {
                            var20 = od.a((long)var14, (long)var14, false) - -od.a((long)var15, (long)var15, false) + -(long)(var16 << 16);
                            var22 = od.a(var18, var18, false) + -(4L * od.a((long)var17, var20, false));
                            if (0L <= var22) {
                              var24 = bm.a(-107, var22);
                              if (var24 <= 2147483647L) {
                                if (var24 >= -2147483648L) {
                                  var26 = (int)((-var18 - -var24 << 15) / (long)var17);
                                  var27 = (int)((-var18 + -var24 << 15) / (long)var17);
                                  if (var26 > 0) {
                                    L10: {
                                      if (65536 + -param1 < var26) {
                                        break L10;
                                      } else {
                                        if (var26 > var27) {
                                          break L10;
                                        } else {
                                          return var26 - -param1;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (var27 <= 0) {
                                        break L11;
                                      } else {
                                        if (65536 - param1 >= var27) {
                                          return param1 + var27;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (var26 > 0) {
                                        break L12;
                                      } else {
                                        if (0 < var27) {
                                          return 1 + param1;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    L13: {
                                      if (var27 > 0) {
                                        break L13;
                                      } else {
                                        if (var26 <= 0) {
                                          break L13;
                                        } else {
                                          return 1 + param1;
                                        }
                                      }
                                    }
                                    return -1;
                                  } else {
                                    L14: {
                                      if (var27 <= 0) {
                                        break L14;
                                      } else {
                                        if (65536 - param1 >= var27) {
                                          return param1 + var27;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    L15: {
                                      L16: {
                                        if (var26 > 0) {
                                          break L16;
                                        } else {
                                          if (0 < var27) {
                                            break L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      L17: {
                                        if (var27 > 0) {
                                          break L17;
                                        } else {
                                          if (var26 <= 0) {
                                            break L17;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      return -1;
                                    }
                                    return 1 + param1;
                                  }
                                } else {
                                  throw new IllegalStateException("Out of range: 0x" + Long.toString(var24, 16));
                                }
                              } else {
                                throw new IllegalStateException("Out of range: 0x" + Long.toString(var24, 16));
                              }
                            } else {
                              return -1;
                            }
                          }
                        }
                      }
                      return -1;
                    }
                  }
                }
                return -1;
              } else {
                return -1;
              }
            } else {
              var16 = 256;
              var17 = aj.a(var12, false, var12) - -aj.a(var13, false, var13);
              if (var17 != 0) {
                L18: {
                  var18 = 2L * (od.a((long)var14, (long)var12, false) - -od.a((long)var15, (long)var13, false));
                  if (var18 > 2147483647L) {
                    break L18;
                  } else {
                    if (-2147483648L > var18) {
                      break L18;
                    } else {
                      L19: {
                        if ((var14 >> 16) * (var14 >> 16) > 2147483647) {
                          break L19;
                        } else {
                          if (2147483647 < (var15 >> 16) * (var15 >> 16)) {
                            break L19;
                          } else {
                            var20 = od.a((long)var14, (long)var14, false) - -od.a((long)var15, (long)var15, false) + -(long)(var16 << 16);
                            var22 = od.a(var18, var18, false) + -(4L * od.a((long)var17, var20, false));
                            if (0L <= var22) {
                              L20: {
                                var24 = bm.a(-107, var22);
                                if (var24 > 2147483647L) {
                                  break L20;
                                } else {
                                  if (var24 >= -2147483648L) {
                                    L21: {
                                      var26 = (int)((-var18 - -var24 << 15) / (long)var17);
                                      var27 = (int)((-var18 + -var24 << 15) / (long)var17);
                                      if (var26 <= 0) {
                                        break L21;
                                      } else {
                                        if (65536 + -param1 < var26) {
                                          break L21;
                                        } else {
                                          if (var26 > var27) {
                                            break L21;
                                          } else {
                                            return var26 - -param1;
                                          }
                                        }
                                      }
                                    }
                                    L22: {
                                      if (var27 <= 0) {
                                        break L22;
                                      } else {
                                        if (65536 - param1 >= var27) {
                                          return param1 + var27;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                    L23: {
                                      L24: {
                                        if (var26 > 0) {
                                          break L24;
                                        } else {
                                          if (0 < var27) {
                                            break L23;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                      L25: {
                                        if (var27 > 0) {
                                          break L25;
                                        } else {
                                          if (var26 <= 0) {
                                            break L25;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      return -1;
                                    }
                                    return 1 + param1;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              throw new IllegalStateException("Out of range: 0x" + Long.toString(var24, 16));
                            } else {
                              return -1;
                            }
                          }
                        }
                      }
                      return -1;
                    }
                  }
                }
                return -1;
              } else {
                return -1;
              }
            }
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
          ((no) this).field_m = -3;
          return ((no) this).field_t.b(0) - -((no) this).field_o.b(0);
        } else {
          return ((no) this).field_t.b(0) - -((no) this).field_o.b(0);
        }
    }

    public static void b(int param0) {
        field_s = null;
        field_b = null;
        field_k = null;
        field_q = null;
        field_n = null;
        field_h = null;
        field_g = null;
    }

    abstract void c(byte param0);

    final sp a(int param0, int param1, byte param2, boolean param3, int param4) {
        if (param4 != -154018400) {
            return null;
        }
        long var6 = (long)param0 + ((long)param1 << 32);
        sp var8 = new sp();
        var8.field_x = param3 ? true : false;
        var8.field_L = param2;
        var8.field_m = var6;
        if (!param3) {
            if (20 <= ((no) this).a(false)) {
                throw new RuntimeException();
            }
            ((no) this).field_t.a((rg) (Object) var8, false);
        } else {
            if (!(((no) this).c(4609) < 20)) {
                throw new RuntimeException();
            }
            ((no) this).field_j.a((rg) (Object) var8, false);
        }
        return var8;
    }

    final int c(int param0) {
        if (param0 != 4609) {
            return 86;
        }
        return ((no) this).field_j.b(0) + ((no) this).field_f.b(0);
    }

    no() {
        ((no) this).field_j = new wo();
        ((no) this).field_f = new wo();
        ((no) this).field_t = new wo();
        ((no) this).field_o = new wo();
        ((no) this).field_r = new ge(6);
        ((no) this).field_e = 0;
        ((no) this).field_a = 0;
        ((no) this).field_c = (byte) 0;
        ((no) this).field_p = new ge(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new na();
        field_s = new int[16];
        field_h = new nl();
        field_n = new int[16];
        field_g = new hj(8, 0, 4, 1);
        field_b = "Game drawn";
    }
}
