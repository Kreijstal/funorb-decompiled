/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends td {
    private g field_s;
    private byte[] field_p;
    private v field_f;
    static int[] field_n;
    private vh field_k;
    private int field_j;
    private int field_r;
    private vh field_l;
    private byte[] field_m;
    static String field_t;
    private int field_q;
    private vi field_u;
    private gj field_i;
    private uk field_o;
    private bc field_h;
    private bc field_c;
    private boolean field_g;
    private boolean field_d;
    private int field_w;
    private long field_e;
    private boolean field_v;

    final int a(int param0, int param1) {
        gj var3 = (gj) (Object) ((ce) this).field_o.a(19, (long)param1);
        if (param0 < 111) {
            return -12;
        }
        if (var3 != null) {
            return var3.c((byte) -120);
        }
        return 0;
    }

    final byte[] a(int param0, boolean param1) {
        gj var3 = this.a(0, 255, param0);
        if (var3 == null) {
            return null;
        }
        if (!param1) {
            ((ce) this).field_h = null;
        }
        byte[] var4 = var3.d((byte) -124);
        var3.c(2);
        return var4;
    }

    final void b(byte param0) {
        if (!(((ce) this).field_k != null)) {
            return;
        }
        ((ce) this).field_d = true;
        if (param0 >= -72) {
            return;
        }
        if (!(null != ((ce) this).field_h)) {
            ((ce) this).field_h = new bc();
        }
    }

    final g b(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        if (((ce) this).field_s != null) {
          return ((ce) this).field_s;
        } else {
          L0: {
            if (((ce) this).field_i != null) {
              break L0;
            } else {
              if (!((ce) this).field_f.b(false)) {
                ((ce) this).field_i = (gj) (Object) ((ce) this).field_f.a(((ce) this).field_q, (byte) 0, param0 ^ -102, true, 255);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((ce) this).field_i.field_n) {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                ((ce) this).field_k = null;
                break L1;
              }
            }
            L2: {
              var5 = ((ce) this).field_i.d((byte) -115);
              var2 = var5;
              if (!(((ce) this).field_i instanceof md)) {
                try {
                  L3: {
                    if (var5 != null) {
                      ((ce) this).field_s = new g(var5, ((ce) this).field_r, ((ce) this).field_m);
                      break L3;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    ((ce) this).field_f.c((byte) 118);
                    ((ce) this).field_s = null;
                    if (((ce) this).field_f.b(false)) {
                      ((ce) this).field_i = null;
                      break L4;
                    } else {
                      ((ce) this).field_i = (gj) (Object) ((ce) this).field_f.a(((ce) this).field_q, (byte) 0, -102, true, 255);
                      break L4;
                    }
                  }
                  return null;
                }
                if (((ce) this).field_l == null) {
                  break L2;
                } else {
                  md discarded$1 = ((ce) this).field_u.a(((ce) this).field_l, ((ce) this).field_q, (byte) -78, var5);
                  break L2;
                }
              } else {
                try {
                  L5: {
                    if (var5 != null) {
                      ((ce) this).field_s = new g(var5, ((ce) this).field_r, ((ce) this).field_m);
                      if (((ce) this).field_j != ((ce) this).field_s.field_h) {
                        throw new RuntimeException();
                      } else {
                        break L5;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    ((ce) this).field_s = null;
                    if (!((ce) this).field_f.b(false)) {
                      ((ce) this).field_i = (gj) (Object) ((ce) this).field_f.a(((ce) this).field_q, (byte) 0, 107, true, 255);
                      break L6;
                    } else {
                      ((ce) this).field_i = null;
                      break L6;
                    }
                  }
                  return null;
                }
                break L2;
              }
            }
            L7: {
              ((ce) this).field_i = null;
              if (((ce) this).field_k == null) {
                break L7;
              } else {
                ((ce) this).field_p = new byte[((ce) this).field_s.field_m];
                break L7;
              }
            }
            return ((ce) this).field_s;
          } else {
            return null;
          }
        }
    }

    public static void c() {
        field_t = null;
        field_n = null;
    }

    private final gj a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_92_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_91_0 = null;
        L0: {
          var10 = Bounce.field_N;
          var4 = (Object) (Object) (gj) (Object) ((ce) this).field_o.a(36, (long)param2);
          if (var4 == null) {
            break L0;
          } else {
            if (0 != param0) {
              break L0;
            } else {
              if (((gj) var4).field_m) {
                break L0;
              } else {
                if (!((gj) var4).field_n) {
                  break L0;
                } else {
                  ((gj) var4).c(param1 ^ 253);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              if (param0 != 0) {
                if (param0 == 1) {
                  if (null == ((ce) this).field_k) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((ce) this).field_u.a(3, param2, ((ce) this).field_k);
                    break L2;
                  }
                } else {
                  if (param0 != 2) {
                    throw new RuntimeException();
                  } else {
                    if (null != ((ce) this).field_k) {
                      if (-1 != ((ce) this).field_p[param2]) {
                        throw new RuntimeException();
                      } else {
                        if (!((ce) this).field_f.b((byte) 39)) {
                          var4 = (Object) (Object) ((ce) this).field_f.a(param2, (byte) 2, -122, false, ((ce) this).field_q);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              } else {
                L3: {
                  if (((ce) this).field_k == null) {
                    break L3;
                  } else {
                    if (((ce) this).field_p[param2] != -1) {
                      var4 = (Object) (Object) ((ce) this).field_u.a(param2, ((ce) this).field_k, true);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((ce) this).field_f.b(false)) {
                  var4 = (Object) (Object) ((ce) this).field_f.a(param2, (byte) 2, 81, true, ((ce) this).field_q);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            ((ce) this).field_o.a((long)param2, param1 + -172, (ai) var4);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((gj) var4).field_n) {
          if (param1 == 255) {
            var5 = ((gj) var4).d((byte) -120);
            if (var4 instanceof md) {
              try {
                L4: {
                  L5: {
                    if (var5 == null) {
                      break L5;
                    } else {
                      if (2 < var5.length) {
                        uf.field_b.reset();
                        uf.field_b.update(var5, 0, -2 + var5.length);
                        var6_int = (int)uf.field_b.getValue();
                        if (((ce) this).field_s.field_j[param2] == var6_int) {
                          L6: {
                            if (null == ((ce) this).field_s.field_e) {
                              break L6;
                            } else {
                              if (((ce) this).field_s.field_e[param2] == null) {
                                break L6;
                              } else {
                                var7_ref_byte__ = ((ce) this).field_s.field_e[param2];
                                var8 = jd.a(var5, 0, var5.length + -2, 0);
                                var11 = 0;
                                var9 = var11;
                                L7: while (true) {
                                  if (64 <= var11) {
                                    break L6;
                                  } else {
                                    if (var7_ref_byte__[var11] != var8[var11]) {
                                      throw new RuntimeException();
                                    } else {
                                      var11++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var7 = (65280 & var5[var5.length + -2] << 8) - -(var5[-1 + var5.length] & 255);
                          if (var7 != (65535 & ((ce) this).field_s.field_g[param2])) {
                            throw new RuntimeException();
                          } else {
                            L8: {
                              if (((ce) this).field_p[param2] != 1) {
                                L9: {
                                  if (0 != ((ce) this).field_p[param2]) {
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                ((ce) this).field_p[param2] = (byte) 1;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L10: {
                              if (((gj) var4).field_m) {
                                break L10;
                              } else {
                                ((gj) var4).c(2);
                                break L10;
                              }
                            }
                            stackOut_91_0 = var4;
                            stackIn_92_0 = stackOut_91_0;
                            break L4;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L11: {
                  var6_ref = (Exception) (Object) decompiledCaughtException;
                  ((ce) this).field_p[param2] = (byte) -1;
                  ((gj) var4).c(2);
                  if (((gj) var4).field_m) {
                    if (!((ce) this).field_f.b(false)) {
                      var4 = (Object) (Object) ((ce) this).field_f.a(param2, (byte) 2, 36, true, ((ce) this).field_q);
                      ((ce) this).field_o.a((long)param2, 124, (ai) var4);
                      break L11;
                    } else {
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                return null;
              }
              return (gj) (Object) stackIn_92_0;
            } else {
              try {
                L12: {
                  L13: {
                    if (var5 == null) {
                      break L13;
                    } else {
                      if (2 < var5.length) {
                        uf.field_b.reset();
                        uf.field_b.update(var5, 0, var5.length + -2);
                        var6_int = (int)uf.field_b.getValue();
                        if (((ce) this).field_s.field_j[param2] != var6_int) {
                          throw new RuntimeException();
                        } else {
                          L14: {
                            if (null == ((ce) this).field_s.field_e) {
                              break L14;
                            } else {
                              if (((ce) this).field_s.field_e[param2] != null) {
                                var7_ref_byte__ = ((ce) this).field_s.field_e[param2];
                                var8 = jd.a(var5, 0, var5.length - 2, param1 + -255);
                                var9 = 0;
                                L15: while (true) {
                                  if (var9 >= 64) {
                                    break L14;
                                  } else {
                                    if (var8[var9] != var7_ref_byte__[var9]) {
                                      throw new RuntimeException();
                                    } else {
                                      var9++;
                                      continue L15;
                                    }
                                  }
                                }
                              } else {
                                break L14;
                              }
                            }
                          }
                          ((ce) this).field_f.field_l = 0;
                          ((ce) this).field_f.field_d = 0;
                          break L12;
                        }
                      } else {
                        break L13;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L16: {
                  var6 = (RuntimeException) (Object) decompiledCaughtException;
                  ((ce) this).field_f.c((byte) 113);
                  ((gj) var4).c(2);
                  if (((gj) var4).field_m) {
                    if (!((ce) this).field_f.b(false)) {
                      var4 = (Object) (Object) ((ce) this).field_f.a(param2, (byte) 2, -62, true, ((ce) this).field_q);
                      ((ce) this).field_o.a((long)param2, param1 ^ 202, (ai) var4);
                      break L16;
                    } else {
                      return null;
                    }
                  } else {
                    break L16;
                  }
                }
                return null;
              }
              L17: {
                var5[var5.length + -2] = (byte)(((ce) this).field_s.field_g[param2] >>> 8);
                var5[-1 + var5.length] = (byte)((ce) this).field_s.field_g[param2];
                if (null != ((ce) this).field_k) {
                  md discarded$1 = ((ce) this).field_u.a(((ce) this).field_k, param2, (byte) 97, var5);
                  if (((ce) this).field_p[param2] != 1) {
                    ((ce) this).field_p[param2] = (byte) 1;
                    break L17;
                  } else {
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              L18: {
                if (((gj) var4).field_m) {
                  break L18;
                } else {
                  ((gj) var4).c(2);
                  break L18;
                }
              }
              return (gj) var4;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static String a(CharSequence param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_26_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_27_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var9 = Bounce.field_N;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (~var2_int <= ~var3) {
                    break L2;
                  } else {
                    int discarded$3 = 0;
                    if (!f.a(param0.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (~var3 >= ~var2_int) {
                      break L4;
                    } else {
                      int discarded$4 = 0;
                      if (!f.a(param0.charAt(-1 + var3))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = var3 - var2_int;
                  if (var4 >= 1) {
                    if (var4 <= 12) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L5: while (true) {
                        if (var3 <= var6) {
                          if (0 != var5.length()) {
                            stackOut_27_0 = var5.toString();
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            stackOut_25_0 = null;
                            stackIn_26_0 = stackOut_25_0;
                            return (String) (Object) stackIn_26_0;
                          }
                        } else {
                          L6: {
                            var7 = param0.charAt(var6);
                            if (!ng.a((byte) -95, (char) var7)) {
                              break L6;
                            } else {
                              var8 = hd.a(31400, (char) var7);
                              if (0 != var8) {
                                StringBuilder discarded$5 = var5.append(var8);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var6++;
                          continue L5;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("ce.L(");
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
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + 0 + 41);
        }
        return stackIn_28_0;
    }

    final void c(int param0) {
        int var2 = 0;
        gj var3 = null;
        int var3_int = 0;
        ai var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Bounce.field_N;
          var2 = 97 % ((46 - param0) / 34);
          if (((ce) this).field_h == null) {
            break L0;
          } else {
            if (((ce) this).b(1) == null) {
              return;
            } else {
              if (!((ce) this).field_g) {
                if (((ce) this).field_d) {
                  var3_int = 1;
                  var4 = ((ce) this).field_h.a((byte) -45);
                  L1: while (true) {
                    if (var4 == null) {
                      L2: while (true) {
                        L3: {
                          if (((ce) this).field_w >= ((ce) this).field_s.field_q.length) {
                            break L3;
                          } else {
                            L4: {
                              if (((ce) this).field_s.field_q[((ce) this).field_w] == 0) {
                                break L4;
                              } else {
                                if (!((ce) this).field_f.b((byte) 90)) {
                                  L5: {
                                    if (((ce) this).field_p[((ce) this).field_w] == 1) {
                                      break L5;
                                    } else {
                                      gj discarded$4 = this.a(2, 255, ((ce) this).field_w);
                                      break L5;
                                    }
                                  }
                                  if (1 != ((ce) this).field_p[((ce) this).field_w]) {
                                    var4 = new ai();
                                    var4.field_d = (long)((ce) this).field_w;
                                    ((ce) this).field_h.a(1, var4);
                                    var3_int = 0;
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  var3_int = 0;
                                  break L3;
                                }
                              }
                            }
                            ((ce) this).field_w = ((ce) this).field_w + 1;
                            continue L2;
                          }
                        }
                        if (var3_int != 0) {
                          ((ce) this).field_d = false;
                          ((ce) this).field_w = 0;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      L6: {
                        var5 = (int)var4.field_d;
                        if (((ce) this).field_p[var5] == 1) {
                          break L6;
                        } else {
                          gj discarded$5 = this.a(2, 255, var5);
                          break L6;
                        }
                      }
                      L7: {
                        if (1 == ((ce) this).field_p[var5]) {
                          var4.c(2);
                          break L7;
                        } else {
                          var3_int = 0;
                          break L7;
                        }
                      }
                      var4 = ((ce) this).field_h.d((byte) -47);
                      continue L1;
                    }
                  }
                } else {
                  ((ce) this).field_h = null;
                  break L0;
                }
              } else {
                var3_int = 1;
                var4 = ((ce) this).field_h.a((byte) -126);
                L8: while (true) {
                  if (var4 == null) {
                    L9: while (true) {
                      L10: {
                        if (((ce) this).field_s.field_q.length <= ((ce) this).field_w) {
                          break L10;
                        } else {
                          if (0 != ((ce) this).field_s.field_q[((ce) this).field_w]) {
                            if (((ce) this).field_u.field_b >= 250) {
                              var3_int = 0;
                              break L10;
                            } else {
                              L11: {
                                if (0 != ((ce) this).field_p[((ce) this).field_w]) {
                                  break L11;
                                } else {
                                  gj discarded$6 = this.a(1, 255, ((ce) this).field_w);
                                  break L11;
                                }
                              }
                              L12: {
                                if (((ce) this).field_p[((ce) this).field_w] != 0) {
                                  break L12;
                                } else {
                                  var4 = new ai();
                                  var4.field_d = (long)((ce) this).field_w;
                                  var3_int = 0;
                                  ((ce) this).field_h.a(1, var4);
                                  break L12;
                                }
                              }
                              ((ce) this).field_w = ((ce) this).field_w + 1;
                              continue L9;
                            }
                          } else {
                            ((ce) this).field_w = ((ce) this).field_w + 1;
                            continue L9;
                          }
                        }
                      }
                      if (var3_int != 0) {
                        ((ce) this).field_g = false;
                        ((ce) this).field_w = 0;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    L13: {
                      var5 = (int)var4.field_d;
                      if (((ce) this).field_p[var5] == 0) {
                        gj discarded$7 = this.a(1, 255, var5);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (((ce) this).field_p[var5] == 0) {
                        var3_int = 0;
                        break L14;
                      } else {
                        var4.c(2);
                        break L14;
                      }
                    }
                    var4 = ((ce) this).field_h.d((byte) -102);
                    continue L8;
                  }
                }
              }
            }
          }
        }
        L15: {
          if (!((ce) this).field_v) {
            break L15;
          } else {
            if (((ce) this).field_e <= fa.a(75)) {
              var3 = (gj) (Object) ((ce) this).field_o.b(0);
              L16: while (true) {
                if (var3 == null) {
                  ((ce) this).field_e = fa.a(-27) - -1000L;
                  break L15;
                } else {
                  L17: {
                    if (!var3.field_n) {
                      if (!var3.field_o) {
                        var3.field_o = true;
                        break L17;
                      } else {
                        if (var3.field_m) {
                          var3.c(2);
                          break L17;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                  var3 = (gj) (Object) ((ce) this).field_o.a(-1);
                  continue L16;
                }
              }
            } else {
              break L15;
            }
          }
        }
    }

    final void d(int param0) {
        ai var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Bounce.field_N;
        if (null == ((ce) this).field_h) {
          return;
        } else {
          if (null == ((ce) this).b(1)) {
            return;
          } else {
            if (param0 == 2348) {
              var2 = ((ce) this).field_c.a((byte) -101);
              L0: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  L1: {
                    var3 = (int)var2.field_d;
                    if (0 <= var3) {
                      if (var3 < ((ce) this).field_s.field_m) {
                        if (-1 == ((ce) this).field_s.field_q[var3]) {
                          var2.c(2);
                          break L1;
                        } else {
                          L2: {
                            if (-1 != ((ce) this).field_p[var3]) {
                              break L2;
                            } else {
                              gj discarded$2 = this.a(1, param0 + -2093, var3);
                              break L2;
                            }
                          }
                          L3: {
                            if (((ce) this).field_p[var3] == -1) {
                              gj discarded$3 = this.a(2, 255, var3);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          if (((ce) this).field_p[var3] != 1) {
                            break L1;
                          } else {
                            var2.c(2);
                            break L1;
                          }
                        }
                      } else {
                        var2.c(2);
                        break L1;
                      }
                    } else {
                      var2.c(2);
                      break L1;
                    }
                  }
                  var2 = ((ce) this).field_c.d((byte) -108);
                  continue L0;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    ce(int param0, vh param1, vh param2, v param3, vi param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((ce) this).field_o = new uk(16);
        ((ce) this).field_w = 0;
        ((ce) this).field_c = new bc();
        ((ce) this).field_e = 0L;
        try {
          L0: {
            L1: {
              ((ce) this).field_k = param1;
              ((ce) this).field_q = param0;
              if (((ce) this).field_k == null) {
                ((ce) this).field_g = false;
                break L1;
              } else {
                ((ce) this).field_g = true;
                ((ce) this).field_h = new bc();
                break L1;
              }
            }
            L2: {
              ((ce) this).field_j = param7;
              ((ce) this).field_f = param3;
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
              ((ce) this).field_v = stackIn_7_1 != 0;
              ((ce) this).field_r = param5;
              ((ce) this).field_m = param6;
              ((ce) this).field_u = param4;
              ((ce) this).field_l = param2;
              if (((ce) this).field_l == null) {
                break L3;
              } else {
                ((ce) this).field_i = (gj) (Object) ((ce) this).field_u.a(((ce) this).field_q, ((ce) this).field_l, true);
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
            stackOut_10_1 = new StringBuilder().append("ce.<init>(").append(param0).append(44);
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
          throw ii.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[256];
        field_t = "Creating your account";
    }
}
