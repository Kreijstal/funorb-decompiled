/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class js extends dr {
    private ppa field_h;
    private int field_e;
    private hha field_q;
    private qda field_u;
    private ji field_p;
    private byte[] field_n;
    private int field_t;
    private int field_j;
    private byte[] field_o;
    static int field_l;
    static ft field_g;
    private ss field_i;
    static jea field_d;
    private ppa field_s;
    private dla field_k;
    private int field_m;
    private boolean field_r;
    private vna field_f;
    private vna field_b;
    private boolean field_w;
    private boolean field_v;
    private long field_c;

    final byte[] a(int param0, byte param1) {
        hha var3 = this.a(0, -116, param0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.b((byte) -126);
        if (param1 != -39) {
            return null;
        }
        var3.p(param1 + 124);
        return var4;
    }

    final void b(int param0) {
        int var2_int = 0;
        hha var2 = null;
        vg var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (null != ((js) this).field_f) {
            if (((js) this).a(true) == null) {
              return;
            } else {
              if (((js) this).field_w) {
                var2_int = 1;
                var3 = ((js) this).field_f.f(-80);
                L1: while (true) {
                  if (var3 == null) {
                    L2: while (true) {
                      L3: {
                        if (((js) this).field_m >= ((js) this).field_k.field_c.length) {
                          break L3;
                        } else {
                          L4: {
                            if (-1 == ((js) this).field_k.field_c[((js) this).field_m]) {
                              break L4;
                            } else {
                              if (-251 > ((js) this).field_i.field_b) {
                                L5: {
                                  if (0 != ((js) this).field_n[((js) this).field_m]) {
                                    break L5;
                                  } else {
                                    hha discarded$4 = this.a(1, param0 ^ -988, ((js) this).field_m);
                                    break L5;
                                  }
                                }
                                if (0 == ((js) this).field_n[((js) this).field_m]) {
                                  var3 = new vg();
                                  var3.field_d = (long)((js) this).field_m;
                                  var2_int = 0;
                                  ((js) this).field_f.b((byte) -91, var3);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              } else {
                                var2_int = 0;
                                break L3;
                              }
                            }
                          }
                          ((js) this).field_m = ((js) this).field_m + 1;
                          continue L2;
                        }
                      }
                      if (var2_int == 0) {
                        break L0;
                      } else {
                        ((js) this).field_m = 0;
                        ((js) this).field_w = false;
                        break L0;
                      }
                    }
                  } else {
                    L6: {
                      var4 = (int)var3.field_d;
                      if (((js) this).field_n[var4] != 0) {
                        break L6;
                      } else {
                        hha discarded$5 = this.a(1, param0 ^ -991, var4);
                        break L6;
                      }
                    }
                    L7: {
                      if (((js) this).field_n[var4] == 0) {
                        var2_int = 0;
                        break L7;
                      } else {
                        var3.p(116);
                        break L7;
                      }
                    }
                    var3 = ((js) this).field_f.e(124);
                    continue L1;
                  }
                }
              } else {
                if (((js) this).field_r) {
                  var2_int = 1;
                  var3 = ((js) this).field_f.f(param0 ^ -936);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (((js) this).field_k.field_c.length <= ((js) this).field_m) {
                            break L10;
                          } else {
                            if (((js) this).field_k.field_c[((js) this).field_m] != 0) {
                              if (((js) this).field_u.b(-21)) {
                                var2_int = 0;
                                break L10;
                              } else {
                                L11: {
                                  if (((js) this).field_n[((js) this).field_m] != 1) {
                                    hha discarded$6 = this.a(2, 126, ((js) this).field_m);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                L12: {
                                  if (((js) this).field_n[((js) this).field_m] != 1) {
                                    var3 = new vg();
                                    var3.field_d = (long)((js) this).field_m;
                                    ((js) this).field_f.b((byte) -96, var3);
                                    var2_int = 0;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                ((js) this).field_m = ((js) this).field_m + 1;
                                continue L9;
                              }
                            } else {
                              ((js) this).field_m = ((js) this).field_m + 1;
                              continue L9;
                            }
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          ((js) this).field_m = 0;
                          ((js) this).field_r = false;
                          break L0;
                        }
                      }
                    } else {
                      L13: {
                        var4 = (int)var3.field_d;
                        if (((js) this).field_n[var4] == 1) {
                          break L13;
                        } else {
                          hha discarded$7 = this.a(2, -52, var4);
                          break L13;
                        }
                      }
                      L14: {
                        if (((js) this).field_n[var4] != 1) {
                          var2_int = 0;
                          break L14;
                        } else {
                          var3.p(41);
                          break L14;
                        }
                      }
                      var3 = ((js) this).field_f.e(116);
                      continue L8;
                    }
                  }
                } else {
                  ((js) this).field_f = null;
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L15: {
          if (!((js) this).field_v) {
            break L15;
          } else {
            if (~((js) this).field_c < ~bva.b((byte) -107)) {
              break L15;
            } else {
              var2 = (hha) (Object) ((js) this).field_p.d(param0 + -1000);
              L16: while (true) {
                if (var2 == null) {
                  ((js) this).field_c = 1000L + bva.b((byte) -107);
                  break L15;
                } else {
                  L17: {
                    if (var2.field_m) {
                      break L17;
                    } else {
                      if (!var2.field_k) {
                        var2.field_k = true;
                        break L17;
                      } else {
                        if (!var2.field_l) {
                          throw new RuntimeException();
                        } else {
                          var2.p(46);
                          break L17;
                        }
                      }
                    }
                  }
                  var2 = (hha) (Object) ((js) this).field_p.c(20806);
                  continue L16;
                }
              }
            }
          }
        }
        L18: {
          if (param0 == 1000) {
            break L18;
          } else {
            ((js) this).field_c = -79L;
            break L18;
          }
        }
    }

    final static void a(double param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -256) {
                break L1;
              } else {
                js.a(0.721841364009857, 28);
                break L1;
              }
            }
            L2: {
              if (param0 == ed.field_a) {
                break L2;
              } else {
                var3_int = 0;
                L3: while (true) {
                  if (var3_int >= 256) {
                    ed.field_a = param0;
                    break L2;
                  } else {
                    L4: {
                      var4 = (int)(Math.pow((double)var3_int / 255.0, param0) * 255.0);
                      stackOut_6_0 = sk.field_c;
                      stackOut_6_1 = var3_int;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var4 > 255) {
                        stackOut_8_0 = (int[]) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = 255;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        break L4;
                      } else {
                        stackOut_7_0 = (int[]) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = var4;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        break L4;
                      }
                    }
                    stackIn_9_0[stackIn_9_1] = stackIn_9_2;
                    var3_int++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "js.G(" + param0 + ',' + param1 + ')');
        }
    }

    final int b(int param0, int param1) {
        if (param0 != 27079) {
            byte[] discarded$0 = ((js) this).a(115, (byte) -96);
        }
        hha var3 = (hha) (Object) ((js) this).field_p.a((byte) -104, (long)param1);
        if (var3 == null) {
            return 0;
        }
        return var3.a((byte) -115);
    }

    final void c(int param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (((js) this).field_f == null) {
            return;
        }
        if (!(null != ((js) this).a(true))) {
            return;
        }
        vg var2 = ((js) this).field_b.f(-80);
        while (var2 != null) {
            var3 = (int)var2.field_d;
            if (0 > var3) {
                var2.p(91);
            } else {
                if (((js) this).field_k.field_l <= var3) {
                    var2.p(91);
                } else {
                    if (((js) this).field_k.field_c[var3] == -1) {
                        var2.p(91);
                    } else {
                        if (!(-1 != ((js) this).field_n[var3])) {
                            hha discarded$0 = this.a(1, 124, var3);
                        }
                        if (!(((js) this).field_n[var3] != -1)) {
                            hha discarded$1 = this.a(2, param0 + 28590, var3);
                        }
                        if (!(1 != ((js) this).field_n[var3])) {
                            var2.p(71);
                        }
                    }
                }
            }
            var2 = ((js) this).field_b.e(param0 ^ -28599);
        }
        if (param0 != -28613) {
            ((js) this).field_s = null;
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_d = null;
        if (param0 != -50) {
            field_g = null;
        }
    }

    final void a(byte param0) {
        if (!(null != ((js) this).field_h)) {
            return;
        }
        ((js) this).field_r = true;
        if (null == ((js) this).field_f) {
            ((js) this).field_f = new vna();
        }
        if (param0 != 115) {
            js.b((byte) 13);
        }
    }

    final dla a(boolean param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (((js) this).field_k != null) {
          return ((js) this).field_k;
        } else {
          L0: {
            if (((js) this).field_q != null) {
              break L0;
            } else {
              if (!((js) this).field_u.d(-21)) {
                ((js) this).field_q = (hha) (Object) ((js) this).field_u.a(((js) this).field_j, true, 255, -21, (byte) 0);
                break L0;
              } else {
                return null;
              }
            }
          }
          L1: {
            if (param0) {
              break L1;
            } else {
              ((js) this).a((byte) -56);
              break L1;
            }
          }
          if (!((js) this).field_q.field_m) {
            L2: {
              var5 = ((js) this).field_q.b((byte) -126);
              var2 = var5;
              if (!(((js) this).field_q instanceof sga)) {
                try {
                  L3: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((js) this).field_k = new dla(var5, ((js) this).field_t, ((js) this).field_o);
                      break L3;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    ((js) this).field_u.e(-1);
                    ((js) this).field_k = null;
                    if (!((js) this).field_u.d(-21)) {
                      ((js) this).field_q = (hha) (Object) ((js) this).field_u.a(((js) this).field_j, true, 255, -21, (byte) 0);
                      break L4;
                    } else {
                      ((js) this).field_q = null;
                      break L4;
                    }
                  }
                  return null;
                }
                if (((js) this).field_s != null) {
                  sga discarded$1 = ((js) this).field_i.a(false, ((js) this).field_j, ((js) this).field_s, var5);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                try {
                  L5: {
                    if (var5 != null) {
                      ((js) this).field_k = new dla(var5, ((js) this).field_t, ((js) this).field_o);
                      if (((js) this).field_k.field_a == ((js) this).field_e) {
                        break L5;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    ((js) this).field_k = null;
                    if (!((js) this).field_u.d(-21)) {
                      ((js) this).field_q = (hha) (Object) ((js) this).field_u.a(((js) this).field_j, true, 255, -21, (byte) 0);
                      break L6;
                    } else {
                      ((js) this).field_q = null;
                      break L6;
                    }
                  }
                  return null;
                }
                break L2;
              }
            }
            L7: {
              if (((js) this).field_h != null) {
                ((js) this).field_n = new byte[((js) this).field_k.field_l];
                break L7;
              } else {
                break L7;
              }
            }
            ((js) this).field_q = null;
            return ((js) this).field_k;
          } else {
            return null;
          }
        }
    }

    private final hha a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        int var6 = 0;
        Exception var7 = null;
        RuntimeException var7_ref = null;
        int var7_int = 0;
        int var8_int = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object stackIn_58_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_57_0 = null;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          var4 = (Object) (Object) (hha) (Object) ((js) this).field_p.a((byte) -124, (long)param2);
          if (var4 == null) {
            break L0;
          } else {
            if (param0 != 0) {
              break L0;
            } else {
              if (((hha) var4).field_l) {
                break L0;
              } else {
                if (((hha) var4).field_m) {
                  ((hha) var4).p(12);
                  var4 = null;
                  break L0;
                } else {
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
              if (param0 != 0) {
                if (param0 == 1) {
                  if (((js) this).field_h == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((js) this).field_i.a((byte) -50, param2, ((js) this).field_h);
                    break L2;
                  }
                } else {
                  if (param0 != 2) {
                    throw new RuntimeException();
                  } else {
                    if (((js) this).field_h == null) {
                      throw new RuntimeException();
                    } else {
                      if (((js) this).field_n[param2] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((js) this).field_u.b(-21)) {
                          var4 = (Object) (Object) ((js) this).field_u.a(param2, false, ((js) this).field_j, -21, (byte) 2);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                }
              } else {
                L3: {
                  if (null == ((js) this).field_h) {
                    break L3;
                  } else {
                    if (((js) this).field_n[param2] != -1) {
                      var4 = (Object) (Object) ((js) this).field_i.a(15871, ((js) this).field_h, param2);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((js) this).field_u.d(-21)) {
                  var4 = (Object) (Object) ((js) this).field_u.a(param2, true, ((js) this).field_j, -21, (byte) 2);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            ((js) this).field_p.a((long)param2, 118, (vg) var4);
            break L1;
          }
        }
        if (!((hha) var4).field_m) {
          var5 = ((hha) var4).b((byte) -126);
          var6 = 8 / ((57 - param1) / 63);
          if (!(var4 instanceof sga)) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length <= 2) {
                      break L5;
                    } else {
                      vf.field_g.reset();
                      vf.field_g.update(var5, 0, var5.length + -2);
                      var7_int = (int)vf.field_g.getValue();
                      if (var7_int == ((js) this).field_k.field_j[param2]) {
                        L6: {
                          if (((js) this).field_k.field_h == null) {
                            break L6;
                          } else {
                            if (((js) this).field_k.field_h[param2] == null) {
                              break L6;
                            } else {
                              var8 = ((js) this).field_k.field_h[param2];
                              int discarded$3 = 8;
                              var9 = fja.a(var5.length + -2, var5, 0);
                              var12 = 0;
                              var10 = var12;
                              L7: while (true) {
                                if (var12 >= 64) {
                                  break L6;
                                } else {
                                  if (var9[var12] == var8[var12]) {
                                    var12++;
                                    continue L7;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((js) this).field_u.field_a = 0;
                        ((js) this).field_u.field_n = 0;
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
              var7_ref = (RuntimeException) (Object) decompiledCaughtException;
              ((js) this).field_u.e(-1);
              ((hha) var4).p(82);
              if (((hha) var4).field_l) {
                L8: {
                  if (!((js) this).field_u.d(-21)) {
                    var4 = (Object) (Object) ((js) this).field_u.a(param2, true, ((js) this).field_j, -21, (byte) 2);
                    ((js) this).field_p.a((long)param2, 125, (vg) var4);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L9: {
              var5[-2 + var5.length] = (byte)(((js) this).field_k.field_f[param2] >>> 8);
              var5[-1 + var5.length] = (byte)((js) this).field_k.field_f[param2];
              if (null != ((js) this).field_h) {
                sga discarded$4 = ((js) this).field_i.a(false, param2, ((js) this).field_h, var5);
                if (((js) this).field_n[param2] == 1) {
                  break L9;
                } else {
                  ((js) this).field_n[param2] = (byte) 1;
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if (((hha) var4).field_l) {
                break L10;
              } else {
                ((hha) var4).p(125);
                break L10;
              }
            }
            return (hha) var4;
          } else {
            try {
              L11: {
                L12: {
                  if (var5 == null) {
                    break L12;
                  } else {
                    if (2 >= var5.length) {
                      break L12;
                    } else {
                      vf.field_g.reset();
                      vf.field_g.update(var5, 0, var5.length - 2);
                      var7_int = (int)vf.field_g.getValue();
                      if (var7_int == ((js) this).field_k.field_j[param2]) {
                        L13: {
                          if (null == ((js) this).field_k.field_h) {
                            break L13;
                          } else {
                            if (((js) this).field_k.field_h[param2] != null) {
                              var8 = ((js) this).field_k.field_h[param2];
                              int discarded$5 = 8;
                              var9 = fja.a(-2 + var5.length, var5, 0);
                              var10 = 0;
                              L14: while (true) {
                                if (64 <= var10) {
                                  break L13;
                                } else {
                                  if (var8[var10] == var9[var10]) {
                                    var10++;
                                    continue L14;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        var8_int = (255 & var5[var5.length - 1]) + (65280 & var5[var5.length - 2] << 8);
                        if ((65535 & ((js) this).field_k.field_f[param2]) == var8_int) {
                          L15: {
                            if (1 != ((js) this).field_n[param2]) {
                              L16: {
                                if (((js) this).field_n[param2] != 0) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              ((js) this).field_n[param2] = (byte) 1;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L17: {
                            if (((hha) var4).field_l) {
                              break L17;
                            } else {
                              ((hha) var4).p(70);
                              break L17;
                            }
                          }
                          stackOut_57_0 = var4;
                          stackIn_58_0 = stackOut_57_0;
                          break L11;
                        } else {
                          throw new RuntimeException();
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
              var7 = (Exception) (Object) decompiledCaughtException;
              ((js) this).field_n[param2] = (byte) -1;
              ((hha) var4).p(53);
              if (((hha) var4).field_l) {
                if (!((js) this).field_u.d(-21)) {
                  var4 = (Object) (Object) ((js) this).field_u.a(param2, true, ((js) this).field_j, -21, (byte) 2);
                  ((js) this).field_p.a((long)param2, 117, (vg) var4);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            return (hha) (Object) stackIn_58_0;
          }
        } else {
          return null;
        }
    }

    js(int param0, ppa param1, ppa param2, qda param3, ss param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((js) this).field_p = new ji(16);
        ((js) this).field_m = 0;
        ((js) this).field_b = new vna();
        ((js) this).field_c = 0L;
        try {
          L0: {
            L1: {
              ((js) this).field_h = param1;
              ((js) this).field_j = param0;
              if (((js) this).field_h != null) {
                ((js) this).field_w = true;
                ((js) this).field_f = new vna();
                break L1;
              } else {
                ((js) this).field_w = false;
                break L1;
              }
            }
            L2: {
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
              ((js) this).field_v = stackIn_7_1 != 0;
              ((js) this).field_e = param7;
              ((js) this).field_i = param4;
              ((js) this).field_s = param2;
              ((js) this).field_t = param5;
              ((js) this).field_u = param3;
              ((js) this).field_o = param6;
              if (((js) this).field_s == null) {
                break L3;
              } else {
                ((js) this).field_q = (hha) (Object) ((js) this).field_i.a(15871, ((js) this).field_s, ((js) this).field_j);
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
            stackOut_10_1 = new StringBuilder().append("js.<init>(").append(param0).append(',');
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
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
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
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
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
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
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new ft(1);
    }
}
