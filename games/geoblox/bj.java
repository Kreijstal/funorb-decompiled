/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends nh {
    private fi field_g;
    static boolean field_s;
    private int field_h;
    static int[] field_j;
    private ji field_f;
    private pb field_l;
    private int field_p;
    private uf field_i;
    private int field_m;
    private jh field_y;
    static na field_r;
    private byte[] field_k;
    private byte[] field_x;
    private bm field_u;
    private jh field_e;
    private int field_o;
    private boolean field_v;
    private tf field_t;
    private boolean field_q;
    private tf field_d;
    private boolean field_w;
    private long field_n;

    final bm a(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        if (null != ((bj) this).field_u) {
          return ((bj) this).field_u;
        } else {
          L0: {
            if (((bj) this).field_l == null) {
              if (!((bj) this).field_f.g(20)) {
                ((bj) this).field_l = (pb) (Object) ((bj) this).field_f.a((byte) 0, 255, -21, ((bj) this).field_p, true);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          L1: {
            if (param0 > 111) {
              break L1;
            } else {
              ((bj) this).b((byte) 65);
              break L1;
            }
          }
          if (!((bj) this).field_l.field_u) {
            L2: {
              var5 = ((bj) this).field_l.e(397);
              var2 = var5;
              if (((bj) this).field_l instanceof o) {
                try {
                  L3: {
                    if (var2 != null) {
                      ((bj) this).field_u = new bm(var2, ((bj) this).field_m, ((bj) this).field_x);
                      if (((bj) this).field_u.field_g != ((bj) this).field_h) {
                        throw new RuntimeException();
                      } else {
                        break L3;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    ((bj) this).field_u = null;
                    if (!((bj) this).field_f.g(20)) {
                      ((bj) this).field_l = (pb) (Object) ((bj) this).field_f.a((byte) 0, 255, -21, ((bj) this).field_p, true);
                      break L4;
                    } else {
                      ((bj) this).field_l = null;
                      break L4;
                    }
                  }
                  return null;
                }
                break L2;
              } else {
                try {
                  L5: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((bj) this).field_u = new bm(var5, ((bj) this).field_m, ((bj) this).field_x);
                      break L5;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    ((bj) this).field_f.e(20);
                    ((bj) this).field_u = null;
                    if (((bj) this).field_f.g(20)) {
                      ((bj) this).field_l = null;
                      break L6;
                    } else {
                      ((bj) this).field_l = (pb) (Object) ((bj) this).field_f.a((byte) 0, 255, -21, ((bj) this).field_p, true);
                      break L6;
                    }
                  }
                  return null;
                }
                if (null == ((bj) this).field_y) {
                  break L2;
                } else {
                  o discarded$1 = ((bj) this).field_i.a((byte) 88, ((bj) this).field_p, ((bj) this).field_y, var5);
                  break L2;
                }
              }
            }
            L7: {
              ((bj) this).field_l = null;
              if (((bj) this).field_e == null) {
                break L7;
              } else {
                ((bj) this).field_k = new byte[((bj) this).field_u.field_b];
                break L7;
              }
            }
            return ((bj) this).field_u;
          } else {
            return null;
          }
        }
    }

    private final pb a(byte param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_53_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_52_0 = null;
        L0: {
          var10 = Geoblox.field_C;
          var4 = (Object) (Object) (pb) (Object) ((bj) this).field_g.a((long)param2, (byte) -124);
          if (var4 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (((pb) var4).field_q) {
                break L0;
              } else {
                if (!((pb) var4).field_u) {
                  break L0;
                } else {
                  ((pb) var4).a(false);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              if (param1 != 0) {
                if (param1 == 1) {
                  if (null != ((bj) this).field_e) {
                    var4 = (Object) (Object) ((bj) this).field_i.a(60, ((bj) this).field_e, param2);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (param1 != 2) {
                    throw new RuntimeException();
                  } else {
                    if (null != ((bj) this).field_e) {
                      if (((bj) this).field_k[param2] == -1) {
                        if (!((bj) this).field_f.b(-21)) {
                          var4 = (Object) (Object) ((bj) this).field_f.a((byte) 2, ((bj) this).field_p, -21, param2, false);
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              } else {
                L3: {
                  if (null == ((bj) this).field_e) {
                    break L3;
                  } else {
                    if (-1 == ((bj) this).field_k[param2]) {
                      break L3;
                    } else {
                      var4 = (Object) (Object) ((bj) this).field_i.a(((bj) this).field_e, param2, 15079962);
                      break L2;
                    }
                  }
                }
                if (!((bj) this).field_f.g(20)) {
                  var4 = (Object) (Object) ((bj) this).field_f.a((byte) 2, ((bj) this).field_p, -21, param2, true);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            ((bj) this).field_g.a((byte) 102, (hf) var4, (long)param2);
            break L1;
          }
        }
        if (!((pb) var4).field_u) {
          var5 = ((pb) var4).e(397);
          if (!(var4 instanceof o)) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length <= 2) {
                      break L5;
                    } else {
                      ge.field_f.reset();
                      ge.field_f.update(var5, 0, var5.length + -2);
                      var6_int = (int)ge.field_f.getValue();
                      if (var6_int == ((bj) this).field_u.field_q[param2]) {
                        L6: {
                          if (null == ((bj) this).field_u.field_r) {
                            break L6;
                          } else {
                            if (null != ((bj) this).field_u.field_r[param2]) {
                              var7 = ((bj) this).field_u.field_r[param2];
                              int discarded$3 = 8;
                              var8 = wh.a(-2 + var5.length, 0, var5);
                              var11 = 0;
                              var9 = var11;
                              L7: while (true) {
                                if (var11 >= 64) {
                                  break L6;
                                } else {
                                  if (var8[var11] == var7[var11]) {
                                    var11++;
                                    continue L7;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        ((bj) this).field_f.field_b = 0;
                        ((bj) this).field_f.field_q = 0;
                        break L4;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                ((bj) this).field_f.e(20);
                ((pb) var4).a(false);
                if (((pb) var4).field_q) {
                  if (!((bj) this).field_f.g(20)) {
                    var4 = (Object) (Object) ((bj) this).field_f.a((byte) 2, ((bj) this).field_p, -21, param2, true);
                    ((bj) this).field_g.a((byte) 102, (hf) var4, (long)param2);
                    break L8;
                  } else {
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
              return null;
            }
            L9: {
              var5[var5.length - 2] = (byte)(((bj) this).field_u.field_t[param2] >>> 8);
              var5[-1 + var5.length] = (byte)((bj) this).field_u.field_t[param2];
              if (null == ((bj) this).field_e) {
                break L9;
              } else {
                o discarded$4 = ((bj) this).field_i.a((byte) 66, param2, ((bj) this).field_e, var5);
                if (((bj) this).field_k[param2] != 1) {
                  ((bj) this).field_k[param2] = (byte) 1;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (!((pb) var4).field_q) {
                ((pb) var4).a(false);
                break L10;
              } else {
                break L10;
              }
            }
            return (pb) var4;
          } else {
            try {
              L11: {
                L12: {
                  if (var5 == null) {
                    break L12;
                  } else {
                    if (var5.length <= 2) {
                      break L12;
                    } else {
                      ge.field_f.reset();
                      ge.field_f.update(var5, 0, var5.length + -2);
                      var6_int = (int)ge.field_f.getValue();
                      if (var6_int == ((bj) this).field_u.field_q[param2]) {
                        L13: {
                          if (((bj) this).field_u.field_r == null) {
                            break L13;
                          } else {
                            if (null == ((bj) this).field_u.field_r[param2]) {
                              break L13;
                            } else {
                              var7 = ((bj) this).field_u.field_r[param2];
                              int discarded$5 = 8;
                              var8 = wh.a(-2 + var5.length, 0, var5);
                              var9 = 0;
                              L14: while (true) {
                                if (var9 >= 64) {
                                  break L13;
                                } else {
                                  if (var7[var9] == var8[var9]) {
                                    var9++;
                                    continue L14;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            }
                          }
                        }
                        var7_int = (var5[-2 + var5.length] << 8 & 65280) + (var5[var5.length - 1] & 255);
                        if ((65535 & ((bj) this).field_u.field_t[param2]) != var7_int) {
                          throw new RuntimeException();
                        } else {
                          L15: {
                            if (((bj) this).field_k[param2] != 1) {
                              L16: {
                                if (((bj) this).field_k[param2] != 0) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              ((bj) this).field_k[param2] = (byte) 1;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L17: {
                            if (((pb) var4).field_q) {
                              break L17;
                            } else {
                              ((pb) var4).a(false);
                              break L17;
                            }
                          }
                          stackOut_52_0 = var4;
                          stackIn_53_0 = stackOut_52_0;
                          break L11;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Exception) (Object) decompiledCaughtException;
              ((bj) this).field_k[param2] = (byte) -1;
              ((pb) var4).a(false);
              if (((pb) var4).field_q) {
                if (!((bj) this).field_f.g(20)) {
                  var4 = (Object) (Object) ((bj) this).field_f.a((byte) 2, ((bj) this).field_p, -21, param2, true);
                  ((bj) this).field_g.a((byte) 102, (hf) var4, (long)param2);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            return (pb) (Object) stackIn_53_0;
          }
        } else {
          return null;
        }
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                L2: {
                  if (param0 >= 26) {
                    break L2;
                  } else {
                    var6 = null;
                    String discarded$2 = bj.a(68, (String) null);
                    break L2;
                  }
                }
                stackOut_6_0 = new String(var3);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3[-var4 + (-1 + var2_int)] = param1.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("bj.A(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    final byte[] b(int param0, int param1) {
        pb var3 = this.a((byte) -71, 0, param1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.e(397);
        var3.a(false);
        if (param0 != 4) {
            ((bj) this).b(49);
        }
        return var4;
    }

    final int a(int param0, int param1) {
        pb var3 = (pb) (Object) ((bj) this).field_g.a((long)param1, (byte) -102);
        if (param0 < 125) {
            return -119;
        }
        if (var3 != null) {
            return var3.g(0);
        }
        return 0;
    }

    public static void b() {
        field_r = null;
        field_j = null;
    }

    final void b(int param0) {
        if (((bj) this).field_e == null) {
            return;
        }
        if (param0 < 80) {
            ((bj) this).field_n = -51L;
        }
        ((bj) this).field_v = true;
        if (!(((bj) this).field_d != null)) {
            ((bj) this).field_d = new tf();
        }
    }

    final void a(int param0) {
        int var3 = 0;
        int var4 = Geoblox.field_C;
        if (param0 != 6924) {
            ((bj) this).b((byte) -7);
        }
        if (!(((bj) this).field_d != null)) {
            return;
        }
        if (!(null != ((bj) this).a((byte) 126))) {
            return;
        }
        hf var2 = ((bj) this).field_t.g(0);
        while (var2 != null) {
            var3 = (int)var2.field_a;
            if (var3 < 0) {
                var2.a(false);
            } else {
                if (var3 >= ((bj) this).field_u.field_b) {
                    var2.a(false);
                } else {
                    if (((bj) this).field_u.field_a[var3] == 0) {
                        var2.a(false);
                    } else {
                        if (((bj) this).field_k[var3] == 0) {
                            pb discarded$0 = this.a((byte) -71, 1, var3);
                        }
                        if (-1 == ((bj) this).field_k[var3]) {
                            pb discarded$1 = this.a((byte) -71, 2, var3);
                        }
                        if (!(((bj) this).field_k[var3] != 1)) {
                            var2.a(false);
                        }
                    }
                }
            }
            var2 = ((bj) this).field_t.d(1);
        }
    }

    final void b(byte param0) {
        int var2_int = 0;
        pb var2 = null;
        hf var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                var5 = Geoblox.field_C;
                if (((bj) this).field_d == null) {
                  break L3;
                } else {
                  if (null != ((bj) this).a((byte) 118)) {
                    if (((bj) this).field_q) {
                      var2_int = 1;
                      var3 = ((bj) this).field_d.g(0);
                      L4: while (true) {
                        if (var3 == null) {
                          L5: while (true) {
                            L6: {
                              if (((bj) this).field_o >= ((bj) this).field_u.field_a.length) {
                                break L6;
                              } else {
                                if (0 != ((bj) this).field_u.field_a[((bj) this).field_o]) {
                                  if (((bj) this).field_i.field_d >= 250) {
                                    var2_int = 0;
                                    break L6;
                                  } else {
                                    L7: {
                                      if (((bj) this).field_k[((bj) this).field_o] != 0) {
                                        break L7;
                                      } else {
                                        pb discarded$6 = this.a((byte) -71, 1, ((bj) this).field_o);
                                        break L7;
                                      }
                                    }
                                    L8: {
                                      if (0 == ((bj) this).field_k[((bj) this).field_o]) {
                                        var3 = new hf();
                                        var3.field_a = (long)((bj) this).field_o;
                                        var2_int = 0;
                                        ((bj) this).field_d.a(-45, var3);
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    ((bj) this).field_o = ((bj) this).field_o + 1;
                                    continue L5;
                                  }
                                } else {
                                  ((bj) this).field_o = ((bj) this).field_o + 1;
                                  continue L5;
                                }
                              }
                            }
                            if (var2_int == 0) {
                              break L3;
                            } else {
                              ((bj) this).field_o = 0;
                              ((bj) this).field_q = false;
                              break L3;
                            }
                          }
                        } else {
                          L9: {
                            var4 = (int)var3.field_a;
                            if (((bj) this).field_k[var4] != 0) {
                              break L9;
                            } else {
                              pb discarded$7 = this.a((byte) -71, 1, var4);
                              break L9;
                            }
                          }
                          L10: {
                            if (((bj) this).field_k[var4] != 0) {
                              var3.a(false);
                              break L10;
                            } else {
                              var2_int = 0;
                              break L10;
                            }
                          }
                          var3 = ((bj) this).field_d.d(1);
                          continue L4;
                        }
                      }
                    } else {
                      if (((bj) this).field_v) {
                        var2_int = 1;
                        var3 = ((bj) this).field_d.g(0);
                        L11: while (true) {
                          if (var3 == null) {
                            L12: while (true) {
                              L13: {
                                if (((bj) this).field_o >= ((bj) this).field_u.field_a.length) {
                                  break L13;
                                } else {
                                  if (((bj) this).field_u.field_a[((bj) this).field_o] == 0) {
                                    ((bj) this).field_o = ((bj) this).field_o + 1;
                                    continue L12;
                                  } else {
                                    if (((bj) this).field_f.b(-21)) {
                                      var2_int = 0;
                                      break L13;
                                    } else {
                                      L14: {
                                        if (((bj) this).field_k[((bj) this).field_o] == 1) {
                                          break L14;
                                        } else {
                                          pb discarded$8 = this.a((byte) -71, 2, ((bj) this).field_o);
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        if (((bj) this).field_k[((bj) this).field_o] == 1) {
                                          break L15;
                                        } else {
                                          var3 = new hf();
                                          var3.field_a = (long)((bj) this).field_o;
                                          var2_int = 0;
                                          ((bj) this).field_d.a(-97, var3);
                                          break L15;
                                        }
                                      }
                                      ((bj) this).field_o = ((bj) this).field_o + 1;
                                      continue L12;
                                    }
                                  }
                                }
                              }
                              if (var2_int != 0) {
                                ((bj) this).field_v = false;
                                ((bj) this).field_o = 0;
                                break L3;
                              } else {
                                L16: {
                                  if (param0 == -38) {
                                    break L16;
                                  } else {
                                    byte[] discarded$9 = ((bj) this).b(25, 41);
                                    break L16;
                                  }
                                }
                                if (!((bj) this).field_w) {
                                  break L0;
                                } else {
                                  if (~oa.a(-12520) > ~((bj) this).field_n) {
                                    break L1;
                                  } else {
                                    var2 = (pb) (Object) ((bj) this).field_g.a((byte) 125);
                                    L17: while (true) {
                                      if (var2 == null) {
                                        break L2;
                                      } else {
                                        L18: {
                                          if (!var2.field_u) {
                                            if (var2.field_n) {
                                              if (!var2.field_q) {
                                                throw new RuntimeException();
                                              } else {
                                                var2.a(false);
                                                break L18;
                                              }
                                            } else {
                                              var2.field_n = true;
                                              break L18;
                                            }
                                          } else {
                                            break L18;
                                          }
                                        }
                                        var2 = (pb) (Object) ((bj) this).field_g.b(74);
                                        continue L17;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L19: {
                              var4 = (int)var3.field_a;
                              if (((bj) this).field_k[var4] != 1) {
                                pb discarded$10 = this.a((byte) -71, 2, var4);
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L20: {
                              if (((bj) this).field_k[var4] != 1) {
                                var2_int = 0;
                                break L20;
                              } else {
                                var3.a(false);
                                break L20;
                              }
                            }
                            var3 = ((bj) this).field_d.d(1);
                            continue L11;
                          }
                        }
                      } else {
                        ((bj) this).field_d = null;
                        break L3;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              L21: {
                if (param0 == -38) {
                  break L21;
                } else {
                  byte[] discarded$11 = ((bj) this).b(25, 41);
                  break L21;
                }
              }
              if (!((bj) this).field_w) {
                break L0;
              } else {
                if (~oa.a(-12520) > ~((bj) this).field_n) {
                  break L1;
                } else {
                  var2 = (pb) (Object) ((bj) this).field_g.a((byte) 125);
                  L22: while (true) {
                    if (var2 == null) {
                      break L2;
                    } else {
                      L23: {
                        if (!var2.field_u) {
                          if (var2.field_n) {
                            if (!var2.field_q) {
                              throw new RuntimeException();
                            } else {
                              var2.a(false);
                              break L23;
                            }
                          } else {
                            var2.field_n = true;
                            break L23;
                          }
                        } else {
                          break L23;
                        }
                      }
                      var2 = (pb) (Object) ((bj) this).field_g.b(74);
                      continue L22;
                    }
                  }
                }
              }
            }
            ((bj) this).field_n = 1000L + oa.a(param0 + -12482);
            break L1;
          }
          break L0;
        }
    }

    bj(int param0, jh param1, jh param2, ji param3, uf param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((bj) this).field_g = new fi(16);
        ((bj) this).field_o = 0;
        ((bj) this).field_t = new tf();
        ((bj) this).field_n = 0L;
        try {
          L0: {
            L1: {
              ((bj) this).field_e = param1;
              ((bj) this).field_p = param0;
              if (null == ((bj) this).field_e) {
                ((bj) this).field_q = false;
                break L1;
              } else {
                ((bj) this).field_q = true;
                ((bj) this).field_d = new tf();
                break L1;
              }
            }
            L2: {
              ((bj) this).field_i = param4;
              ((bj) this).field_y = param2;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((bj) this).field_w = stackIn_7_1 != 0;
              ((bj) this).field_x = param6;
              ((bj) this).field_f = param3;
              ((bj) this).field_h = param7;
              ((bj) this).field_m = param5;
              if (((bj) this).field_y == null) {
                break L3;
              } else {
                ((bj) this).field_l = (pb) (Object) ((bj) this).field_i.a(((bj) this).field_y, ((bj) this).field_p, 15079962);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("bj.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
    }
}
