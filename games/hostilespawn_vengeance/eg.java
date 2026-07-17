/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    private int field_t;
    private int field_u;
    private int field_s;
    private int field_r;
    private int field_x;
    private int field_y;
    private int field_z;
    private String field_c;
    static String field_j;
    private int field_i;
    private vm field_a;
    private String[] field_d;
    private int field_b;
    static String field_l;
    private String field_o;
    private int field_m;
    private int field_q;
    static String field_p;
    static bd field_v;
    private int field_e;
    static int field_h;
    private int field_n;
    boolean field_g;
    private int field_f;
    private int field_k;
    static String field_w;

    final boolean b(byte param0) {
        if (param0 != -66) {
            return false;
        }
        return ((eg) this).field_z == 0 ? true : false;
    }

    final void a(int param0) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 <= 39) {
            return;
        }
        if (bm.field_c == 0) {
            uf.field_i[4].b(0, 0, ((eg) this).field_y);
            int discarded$0 = -7068;
            this.b();
            if (0 > ((eg) this).field_z) {
                return;
            }
            si.a(0, 0, 640, 480, 0, 256 - ((eg) this).field_z * 4);
            return;
        }
        vg.field_c.a(0, 0, ((eg) this).field_y / 2);
        if (0 > ((eg) this).field_z) {
            int discarded$1 = -7068;
            this.b();
            return;
        }
        int var2 = -(736 * ((eg) this).field_z / 50) + 480;
        int var3 = 256 + var2;
        if (!(var2 <= 0)) {
            si.c(0, 0, 640, var2, 0);
        }
        if (var3 <= 0) {
            return;
        }
        int discarded$2 = 640;
        int discarded$3 = 32101;
        hj.a(0, var2, 0, 256, -var2 + var3);
    }

    final void a(byte param0) {
        int var3 = 0;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if ((em.field_c & 7) == 0) {
            L1: {
              if (-257 < ((eg) this).field_y) {
                ((eg) this).field_y = ((eg) this).field_y + 1;
                break L1;
              } else {
                break L1;
              }
            }
            if (-257 <= ((eg) this).field_u) {
              break L0;
            } else {
              ((eg) this).field_u = ((eg) this).field_u + 1;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (((eg) this).field_z <= 0) {
            break L2;
          } else {
            ((eg) this).field_z = ((eg) this).field_z - 1;
            break L2;
          }
        }
        if (param0 < -113) {
          if (((eg) this).field_s > ((eg) this).field_n) {
            L3: {
              if (((eg) this).field_r <= 0) {
                if (((eg) this).field_b < 0) {
                  if (em.field_c % ((eg) this).field_t == 0) {
                    ((eg) this).field_i = ((eg) this).field_i + 1;
                    if (0 < ((eg) this).field_i) {
                      if (-47 == ((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i - 1)) {
                        if (((eg) this).field_g) {
                          L4: {
                            ((eg) this).field_r = 40;
                            if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                              break L4;
                            } else {
                              if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) != 60) {
                                break L4;
                              } else {
                                L5: while (true) {
                                  if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                                    break L4;
                                  } else {
                                    if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) == 62) {
                                      break L4;
                                    } else {
                                      ((eg) this).field_i = ((eg) this).field_i + 1;
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                            ((eg) this).field_b = 0;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          L6: {
                            if (-3 > ((eg) this).field_i) {
                              break L6;
                            } else {
                              if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i - 2) != 46) {
                                break L6;
                              } else {
                                L7: {
                                  if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                                    break L7;
                                  } else {
                                    if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) != 60) {
                                      break L7;
                                    } else {
                                      L8: while (true) {
                                        L9: {
                                          if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                                            break L9;
                                          } else {
                                            if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) == 62) {
                                              break L9;
                                            } else {
                                              ((eg) this).field_i = ((eg) this).field_i + 1;
                                              continue L8;
                                            }
                                          }
                                        }
                                        if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                                          ((eg) this).field_b = 0;
                                          return;
                                        } else {
                                          return;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                                  ((eg) this).field_b = 0;
                                  return;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                          if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                            L10: {
                              ((eg) this).field_r = 40;
                              if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                                break L10;
                              } else {
                                if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) != 60) {
                                  break L10;
                                } else {
                                  L11: while (true) {
                                    L12: {
                                      if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                                        break L12;
                                      } else {
                                        if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) == 62) {
                                          break L12;
                                        } else {
                                          ((eg) this).field_i = ((eg) this).field_i + 1;
                                          continue L11;
                                        }
                                      }
                                    }
                                    L13: {
                                      if (((eg) this).field_i < ((eg) this).field_d[((eg) this).field_n].length()) {
                                        break L13;
                                      } else {
                                        ((eg) this).field_b = 0;
                                        break L13;
                                      }
                                    }
                                    return;
                                  }
                                }
                              }
                            }
                            if (((eg) this).field_i < ((eg) this).field_d[((eg) this).field_n].length()) {
                              return;
                            } else {
                              ((eg) this).field_b = 0;
                              return;
                            }
                          } else {
                            if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) != 46) {
                              L14: {
                                ((eg) this).field_r = 40;
                                if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                                  break L14;
                                } else {
                                  if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) != 60) {
                                    break L14;
                                  } else {
                                    L15: while (true) {
                                      L16: {
                                        if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                                          break L16;
                                        } else {
                                          if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) == 62) {
                                            break L16;
                                          } else {
                                            ((eg) this).field_i = ((eg) this).field_i + 1;
                                            continue L15;
                                          }
                                        }
                                      }
                                      if (((eg) this).field_i < ((eg) this).field_d[((eg) this).field_n].length()) {
                                        return;
                                      } else {
                                        ((eg) this).field_b = 0;
                                        return;
                                      }
                                    }
                                  }
                                }
                              }
                              if (((eg) this).field_i < ((eg) this).field_d[((eg) this).field_n].length()) {
                                return;
                              } else {
                                ((eg) this).field_b = 0;
                                return;
                              }
                            } else {
                              L17: {
                                if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                                  break L17;
                                } else {
                                  if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) != 60) {
                                    break L17;
                                  } else {
                                    L18: while (true) {
                                      if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                                        break L17;
                                      } else {
                                        if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) == 62) {
                                          break L17;
                                        } else {
                                          ((eg) this).field_i = ((eg) this).field_i + 1;
                                          continue L18;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L19: {
                                if (((eg) this).field_i < ((eg) this).field_d[((eg) this).field_n].length()) {
                                  break L19;
                                } else {
                                  ((eg) this).field_b = 0;
                                  break L19;
                                }
                              }
                              return;
                            }
                          }
                        }
                      } else {
                        L20: {
                          if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                            break L20;
                          } else {
                            if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) != 60) {
                              break L20;
                            } else {
                              L21: while (true) {
                                L22: {
                                  if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                                    break L22;
                                  } else {
                                    if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) == 62) {
                                      break L22;
                                    } else {
                                      ((eg) this).field_i = ((eg) this).field_i + 1;
                                      continue L21;
                                    }
                                  }
                                }
                                if (((eg) this).field_i < ((eg) this).field_d[((eg) this).field_n].length()) {
                                  return;
                                } else {
                                  ((eg) this).field_b = 0;
                                  return;
                                }
                              }
                            }
                          }
                        }
                        if (((eg) this).field_i < ((eg) this).field_d[((eg) this).field_n].length()) {
                          break L3;
                        } else {
                          ((eg) this).field_b = 0;
                          return;
                        }
                      }
                    } else {
                      L23: {
                        if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                          break L23;
                        } else {
                          if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) != 60) {
                            break L23;
                          } else {
                            L24: while (true) {
                              L25: {
                                if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                                  break L25;
                                } else {
                                  if (((eg) this).field_d[((eg) this).field_n].charAt(((eg) this).field_i) == 62) {
                                    break L25;
                                  } else {
                                    ((eg) this).field_i = ((eg) this).field_i + 1;
                                    continue L24;
                                  }
                                }
                              }
                              if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                                ((eg) this).field_b = 0;
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                      }
                      if (((eg) this).field_i >= ((eg) this).field_d[((eg) this).field_n].length()) {
                        ((eg) this).field_b = 0;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  ((eg) this).field_b = ((eg) this).field_b + 1;
                  if (((eg) this).field_b != ((eg) this).field_m) {
                    return;
                  } else {
                    ((eg) this).field_n = ((eg) this).field_n + 1;
                    ((eg) this).field_b = -1;
                    ((eg) this).field_i = 0;
                    return;
                  }
                }
              } else {
                ((eg) this).field_r = ((eg) this).field_r - 1;
                break L3;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                param1 = v.a(-18214, '_', "", param1);
                var3 = ia.a(param1, -90);
                if (param2.indexOf(param1) != -1) {
                  break L2;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("eg.A(").append(0).append(44);
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
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    public static void c() {
        field_l = null;
        field_v = null;
        field_j = null;
        field_w = null;
        field_p = null;
    }

    final void a(String param0, byte param1) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
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
            var3_int = 75 % ((43 - param1) / 48);
            L1: while (true) {
              try {
                L2: {
                  ((eg) this).field_s = ((eg) this).field_a.a(param0.toUpperCase(), new int[1], ((eg) this).field_d);
                  break L2;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
                  ((eg) this).field_s = -1;
                  ((eg) this).field_d = new String[2 * ((eg) this).field_d.length];
                  break L3;
                }
              }
              if (-1 == ((eg) this).field_s) {
                continue L1;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("eg.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L4;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final void d(int param0) {
        if (param0 != -868) {
          L0: {
            ((eg) this).field_z = -20;
            if (0 > ((eg) this).field_z) {
              ((eg) this).field_z = 50;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (0 > ((eg) this).field_z) {
              ((eg) this).field_z = 50;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = ((eg) this).field_q - (((eg) this).field_b - -(((eg) this).field_n * ((eg) this).field_m));
        var3 = 0;
        L0: while (true) {
          if (((eg) this).field_n <= var3) {
            if (((eg) this).field_n < ((eg) this).field_s) {
              if (((eg) this).field_i <= 0) {
                return;
              } else {
                ((eg) this).field_a.c(((eg) this).field_d[((eg) this).field_n].substring(0, ((eg) this).field_i), ((eg) this).field_e, var2, ((eg) this).field_x, ((eg) this).field_k);
                return;
              }
            } else {
              return;
            }
          } else {
            ((eg) this).field_a.c(((eg) this).field_d[var3], ((eg) this).field_e, var2, ((eg) this).field_x, ((eg) this).field_k);
            var2 = var2 + ((eg) this).field_m;
            var3++;
            continue L0;
          }
        }
    }

    eg() {
        ((eg) this).field_r = 0;
        ((eg) this).field_u = 0;
        ((eg) this).field_i = 0;
        ((eg) this).field_y = 0;
        ((eg) this).field_t = 4;
        ((eg) this).field_c = jd.field_x;
        ((eg) this).field_d = new String[32];
        ((eg) this).field_a = (vm) (Object) al.field_Z;
        ((eg) this).field_x = 13684944;
        ((eg) this).field_b = -1;
        ((eg) this).field_z = -1;
        ((eg) this).field_o = lb.field_c;
        ((eg) this).field_e = 70;
        ((eg) this).field_m = 18;
        ((eg) this).field_q = 400;
        ((eg) this).field_n = 0;
        ((eg) this).field_f = 50;
        ((eg) this).field_g = true;
        ((eg) this).field_k = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Vengeance Expansion Installed";
        field_l = "I should be able to make my way around the blockage via this vent.";
        field_h = 2;
        field_p = "Why is there always a crate blocking the way I want to go?";
    }
}
