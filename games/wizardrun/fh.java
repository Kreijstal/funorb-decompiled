/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends hl {
    private cd field_q;
    private int field_l;
    private int field_d;
    private pc field_s;
    private sg field_g;
    private ab field_n;
    private ml field_v;
    private byte[] field_w;
    private sg field_m;
    private na field_i;
    private int field_k;
    private byte[] field_x;
    static oi field_t;
    private oi field_p;
    private int field_o;
    static int field_f;
    private oi field_u;
    private boolean field_j;
    private boolean field_r;
    private boolean field_e;
    private long field_h;

    final void a(int param0) {
        int var3 = 0;
        int var4 = wizardrun.field_H;
        if (!(null != ((fh) this).field_p)) {
            return;
        }
        if (!(((fh) this).b(false) != null)) {
            return;
        }
        if (param0 != -3) {
            fh.c(16, 122);
        }
        wl var2 = ((fh) this).field_u.b((byte) 72);
        while (var2 != null) {
            var3 = (int)var2.field_e;
            if (var3 < 0) {
                var2.a(false);
            } else {
                if (var3 >= ((fh) this).field_s.field_s) {
                    var2.a(false);
                } else {
                    if (0 == ((fh) this).field_s.field_p[var3]) {
                        var2.a(false);
                    } else {
                        if (((fh) this).field_w[var3] == 0) {
                            ml discarded$0 = this.a(-23529, 1, var3);
                        }
                        if (!(-1 != ((fh) this).field_w[var3])) {
                            ml discarded$1 = this.a(-23529, 2, var3);
                        }
                        if (((fh) this).field_w[var3] == 1) {
                            var2.a(false);
                        }
                    }
                }
            }
            var2 = ((fh) this).field_u.d(param0 ^ -8195);
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        ml var2 = null;
        wl var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = wizardrun.field_H;
          if (param0 == 25) {
            break L0;
          } else {
            ((fh) this).field_o = -118;
            break L0;
          }
        }
        L1: {
          if (((fh) this).field_p != null) {
            if (null == ((fh) this).b(false)) {
              return;
            } else {
              if (!((fh) this).field_r) {
                if (((fh) this).field_j) {
                  var2_int = 1;
                  var3 = ((fh) this).field_p.b((byte) 73);
                  L2: while (true) {
                    if (var3 == null) {
                      L3: while (true) {
                        L4: {
                          if (((fh) this).field_o >= ((fh) this).field_s.field_p.length) {
                            break L4;
                          } else {
                            if (((fh) this).field_s.field_p[((fh) this).field_o] != 0) {
                              if (((fh) this).field_i.c(-21)) {
                                var2_int = 0;
                                break L4;
                              } else {
                                L5: {
                                  if (1 == ((fh) this).field_w[((fh) this).field_o]) {
                                    break L5;
                                  } else {
                                    ml discarded$4 = this.a(-23529, 2, ((fh) this).field_o);
                                    break L5;
                                  }
                                }
                                L6: {
                                  if (((fh) this).field_w[((fh) this).field_o] == 1) {
                                    break L6;
                                  } else {
                                    var3 = new wl();
                                    var3.field_e = (long)((fh) this).field_o;
                                    ((fh) this).field_p.a(var3, false);
                                    var2_int = 0;
                                    break L6;
                                  }
                                }
                                ((fh) this).field_o = ((fh) this).field_o + 1;
                                continue L3;
                              }
                            } else {
                              ((fh) this).field_o = ((fh) this).field_o + 1;
                              continue L3;
                            }
                          }
                        }
                        if (var2_int != 0) {
                          ((fh) this).field_o = 0;
                          ((fh) this).field_j = false;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      L7: {
                        var4 = (int)var3.field_e;
                        if (((fh) this).field_w[var4] != 1) {
                          ml discarded$5 = this.a(-23529, 2, var4);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (((fh) this).field_w[var4] != 1) {
                          var2_int = 0;
                          break L8;
                        } else {
                          var3.a(false);
                          break L8;
                        }
                      }
                      var3 = ((fh) this).field_p.d(8192);
                      continue L2;
                    }
                  }
                } else {
                  ((fh) this).field_p = null;
                  break L1;
                }
              } else {
                var2_int = 1;
                var3 = ((fh) this).field_p.b((byte) 83);
                L9: while (true) {
                  if (var3 == null) {
                    L10: while (true) {
                      L11: {
                        if (((fh) this).field_s.field_p.length <= ((fh) this).field_o) {
                          break L11;
                        } else {
                          L12: {
                            if (((fh) this).field_s.field_p[((fh) this).field_o] == 0) {
                              break L12;
                            } else {
                              if (((fh) this).field_q.field_b >= 250) {
                                var2_int = 0;
                                break L11;
                              } else {
                                L13: {
                                  if (0 != ((fh) this).field_w[((fh) this).field_o]) {
                                    break L13;
                                  } else {
                                    ml discarded$6 = this.a(-23529, 1, ((fh) this).field_o);
                                    break L13;
                                  }
                                }
                                if (0 == ((fh) this).field_w[((fh) this).field_o]) {
                                  var3 = new wl();
                                  var3.field_e = (long)((fh) this).field_o;
                                  var2_int = 0;
                                  ((fh) this).field_p.a(var3, false);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          ((fh) this).field_o = ((fh) this).field_o + 1;
                          continue L10;
                        }
                      }
                      if (var2_int != 0) {
                        ((fh) this).field_o = 0;
                        ((fh) this).field_r = false;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    L14: {
                      var4 = (int)var3.field_e;
                      if (0 == ((fh) this).field_w[var4]) {
                        ml discarded$7 = this.a(-23529, 1, var4);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (((fh) this).field_w[var4] != 0) {
                        var3.a(false);
                        break L15;
                      } else {
                        var2_int = 0;
                        break L15;
                      }
                    }
                    var3 = ((fh) this).field_p.d(8192);
                    continue L9;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
        if (((fh) this).field_e) {
          if (~d.a((byte) 100) <= ~((fh) this).field_h) {
            var2 = (ml) (Object) ((fh) this).field_n.b((byte) -114);
            L16: while (true) {
              if (var2 != null) {
                L17: {
                  if (!var2.field_s) {
                    if (!var2.field_q) {
                      var2.field_q = true;
                      break L17;
                    } else {
                      if (!var2.field_r) {
                        throw new RuntimeException();
                      } else {
                        var2.a(false);
                        break L17;
                      }
                    }
                  } else {
                    break L17;
                  }
                }
                var2 = (ml) (Object) ((fh) this).field_n.b(param0 ^ 24);
                continue L16;
              } else {
                ((fh) this).field_h = 1000L + d.a((byte) 67);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final ml a(int param0, int param1, int param2) {
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
        Object stackIn_89_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_88_0 = null;
        L0: {
          var10 = wizardrun.field_H;
          var4 = (Object) (Object) (ml) (Object) ((fh) this).field_n.a(1, (long)param2);
          if (var4 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (((ml) var4).field_r) {
                break L0;
              } else {
                if (!((ml) var4).field_s) {
                  break L0;
                } else {
                  ((ml) var4).a(false);
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
              if (param1 == 0) {
                L3: {
                  if (((fh) this).field_g == null) {
                    break L3;
                  } else {
                    if (((fh) this).field_w[param2] == -1) {
                      break L3;
                    } else {
                      var4 = (Object) (Object) ((fh) this).field_q.a(param2, 1, ((fh) this).field_g);
                      break L2;
                    }
                  }
                }
                if (!((fh) this).field_i.a(3473)) {
                  var4 = (Object) (Object) ((fh) this).field_i.a(((fh) this).field_d, param2, (byte) -85, (byte) 2, true);
                  break L2;
                } else {
                  return null;
                }
              } else {
                if (param1 != 1) {
                  if (param1 == 2) {
                    if (null != ((fh) this).field_g) {
                      if (((fh) this).field_w[param2] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((fh) this).field_i.c(-21)) {
                          var4 = (Object) (Object) ((fh) this).field_i.a(((fh) this).field_d, param2, (byte) -73, (byte) 2, false);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (null == ((fh) this).field_g) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((fh) this).field_q.a((byte) -46, param2, ((fh) this).field_g);
                    break L2;
                  }
                }
              }
            }
            ((fh) this).field_n.a((wl) var4, -67, (long)param2);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((ml) var4).field_s) {
          var5 = ((ml) var4).d(95);
          if (var4 instanceof sk) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length > 2) {
                      rk.field_j.reset();
                      rk.field_j.update(var5, 0, -2 + var5.length);
                      var6_int = (int)rk.field_j.getValue();
                      if (((fh) this).field_s.field_q[param2] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L6: {
                          if (null == ((fh) this).field_s.field_j) {
                            break L6;
                          } else {
                            if (null == ((fh) this).field_s.field_j[param2]) {
                              break L6;
                            } else {
                              var7_ref_byte__ = ((fh) this).field_s.field_j[param2];
                              var8 = id.a(var5, 0, -2 + var5.length, 0);
                              var11 = 0;
                              var9 = var11;
                              L7: while (true) {
                                if (64 <= var11) {
                                  break L6;
                                } else {
                                  if (var8[var11] != var7_ref_byte__[var11]) {
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
                        var7 = ((255 & var5[var5.length + -2]) << 8) - -(var5[-1 + var5.length] & 255);
                        if (var7 != (65535 & ((fh) this).field_s.field_n[param2])) {
                          throw new RuntimeException();
                        } else {
                          L8: {
                            if (((fh) this).field_w[param2] != 1) {
                              L9: {
                                if (((fh) this).field_w[param2] != 0) {
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              ((fh) this).field_w[param2] = (byte) 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L10: {
                            if (!((ml) var4).field_r) {
                              ((ml) var4).a(false);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          stackOut_88_0 = var4;
                          stackIn_89_0 = stackOut_88_0;
                          break L4;
                        }
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
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((fh) this).field_w[param2] = (byte) -1;
              ((ml) var4).a(false);
              if (((ml) var4).field_r) {
                if (((fh) this).field_i.a(3473)) {
                  return null;
                } else {
                  var4 = (Object) (Object) ((fh) this).field_i.a(((fh) this).field_d, param2, (byte) -123, (byte) 2, true);
                  ((fh) this).field_n.a((wl) var4, -103, (long)param2);
                  return null;
                }
              } else {
                return null;
              }
            }
            return (ml) (Object) stackIn_89_0;
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
                      rk.field_j.reset();
                      rk.field_j.update(var5, 0, -2 + var5.length);
                      var6_int = (int)rk.field_j.getValue();
                      if (((fh) this).field_s.field_q[param2] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L13: {
                          if (null == ((fh) this).field_s.field_j) {
                            break L13;
                          } else {
                            if (null != ((fh) this).field_s.field_j[param2]) {
                              var7_ref_byte__ = ((fh) this).field_s.field_j[param2];
                              var8 = id.a(var5, 0, var5.length + -2, 0);
                              var9 = 0;
                              L14: while (true) {
                                if (64 <= var9) {
                                  break L13;
                                } else {
                                  if (var8[var9] == var7_ref_byte__[var9]) {
                                    var9++;
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
                        ((fh) this).field_i.field_k = 0;
                        ((fh) this).field_i.field_n = 0;
                        break L11;
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L15: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                ((fh) this).field_i.a(true);
                ((ml) var4).a(false);
                if (((ml) var4).field_r) {
                  if (!((fh) this).field_i.a(3473)) {
                    var4 = (Object) (Object) ((fh) this).field_i.a(((fh) this).field_d, param2, (byte) -125, (byte) 2, true);
                    ((fh) this).field_n.a((wl) var4, -115, (long)param2);
                    break L15;
                  } else {
                    break L15;
                  }
                } else {
                  break L15;
                }
              }
              return null;
            }
            L16: {
              var5[-2 + var5.length] = (byte)(((fh) this).field_s.field_n[param2] >>> 8);
              var5[var5.length - 1] = (byte)((fh) this).field_s.field_n[param2];
              if (null != ((fh) this).field_g) {
                sk discarded$1 = ((fh) this).field_q.a((byte) -124, ((fh) this).field_g, var5, param2);
                if (((fh) this).field_w[param2] == 1) {
                  break L16;
                } else {
                  ((fh) this).field_w[param2] = (byte) 1;
                  break L16;
                }
              } else {
                break L16;
              }
            }
            L17: {
              if (((ml) var4).field_r) {
                break L17;
              } else {
                ((ml) var4).a(false);
                break L17;
              }
            }
            return (ml) var4;
          }
        } else {
          return null;
        }
    }

    public static void b() {
        field_t = null;
    }

    final static void b(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ai var4 = null;
        nj var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = wizardrun.field_H;
        try {
          L0: {
            var4 = (ai) (Object) field_t.b((byte) 100);
            L1: while (true) {
              if (var4 == null) {
                var5 = (nj) (Object) pc.field_l.b((byte) 91);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    int discarded$4 = 121;
                    ri.a(var5, 3);
                    var5 = (nj) (Object) pc.field_l.d(8192);
                    continue L2;
                  }
                }
              } else {
                og.a(var4, 3, 123);
                var4 = (ai) (Object) field_t.d(8192);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "fh.G(" + -28323 + ',' + 3 + ')');
        }
    }

    final byte[] a(byte param0, int param1) {
        ml var3 = null;
        byte[] var4 = null;
        var3 = this.a(-23529, 0, param1);
        if (var3 == null) {
          return null;
        } else {
          L0: {
            var4 = var3.d(95);
            if (param0 < -21) {
              break L0;
            } else {
              fh.c(-33, -78);
              break L0;
            }
          }
          var3.a(false);
          return var4;
        }
    }

    final static void c(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        of var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var4 = (of) (Object) bh.field_b.b((byte) 96);
              if (param1 == 0) {
                break L1;
              } else {
                field_f = 48;
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                int discarded$4 = -81;
                di.a(var4, param0);
                var4 = (of) (Object) bh.field_b.d(param1 ^ 8192);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "fh.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1) {
        param1 = (param1 & 1431655765) - -((param1 & -1431655765) >>> 1);
        param1 = ((param1 & -858993460) >>> 2) + (858993459 & param1);
        param1 = param1 - -(param1 >>> 4) & 252645135;
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return 255 & param1;
    }

    final void a(byte param0) {
        int var2 = 0;
        if (((fh) this).field_g == null) {
          return;
        } else {
          L0: {
            var2 = -38 / ((-32 - param0) / 59);
            ((fh) this).field_j = true;
            if (null != ((fh) this).field_p) {
              break L0;
            } else {
              ((fh) this).field_p = new oi();
              break L0;
            }
          }
          return;
        }
    }

    final pc b(boolean param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        na stackIn_27_0 = null;
        na stackIn_28_0 = null;
        na stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        RuntimeException decompiledCaughtException = null;
        na stackOut_26_0 = null;
        na stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        na stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        var4 = wizardrun.field_H;
        if (((fh) this).field_s != null) {
          return ((fh) this).field_s;
        } else {
          L0: {
            if (null != ((fh) this).field_v) {
              break L0;
            } else {
              if (!((fh) this).field_i.a(3473)) {
                ((fh) this).field_v = (ml) (Object) ((fh) this).field_i.a(255, ((fh) this).field_d, (byte) -119, (byte) 0, true);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((fh) this).field_v.field_s) {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((fh) this).c((byte) -59);
                break L1;
              }
            }
            L2: {
              var5 = ((fh) this).field_v.d(95);
              var2 = var5;
              if (!(((fh) this).field_v instanceof sk)) {
                try {
                  L3: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((fh) this).field_s = new pc(var5, ((fh) this).field_l, ((fh) this).field_x);
                      break L3;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    stackOut_26_0 = ((fh) this).field_i;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (param0) {
                      stackOut_28_0 = (na) (Object) stackIn_28_0;
                      stackOut_28_1 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      break L4;
                    } else {
                      stackOut_27_0 = (na) (Object) stackIn_27_0;
                      stackOut_27_1 = 1;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      break L4;
                    }
                  }
                  L5: {
                    ((na) (Object) stackIn_29_0).a(stackIn_29_1 != 0);
                    ((fh) this).field_s = null;
                    if (((fh) this).field_i.a(3473)) {
                      ((fh) this).field_v = null;
                      break L5;
                    } else {
                      ((fh) this).field_v = (ml) (Object) ((fh) this).field_i.a(255, ((fh) this).field_d, (byte) -88, (byte) 0, true);
                      break L5;
                    }
                  }
                  return null;
                }
                if (null != ((fh) this).field_m) {
                  sk discarded$1 = ((fh) this).field_q.a((byte) 0, ((fh) this).field_m, var5, ((fh) this).field_d);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                try {
                  L6: {
                    if (var5 != null) {
                      ((fh) this).field_s = new pc(var5, ((fh) this).field_l, ((fh) this).field_x);
                      if (((fh) this).field_k == ((fh) this).field_s.field_f) {
                        break L6;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L7: {
                    var3 = decompiledCaughtException;
                    ((fh) this).field_s = null;
                    if (((fh) this).field_i.a(3473)) {
                      ((fh) this).field_v = null;
                      break L7;
                    } else {
                      ((fh) this).field_v = (ml) (Object) ((fh) this).field_i.a(255, ((fh) this).field_d, (byte) -100, (byte) 0, true);
                      break L7;
                    }
                  }
                  return null;
                }
                break L2;
              }
            }
            L8: {
              ((fh) this).field_v = null;
              if (null != ((fh) this).field_g) {
                ((fh) this).field_w = new byte[((fh) this).field_s.field_s];
                break L8;
              } else {
                break L8;
              }
            }
            return ((fh) this).field_s;
          } else {
            return null;
          }
        }
    }

    final int a(boolean param0, int param1) {
        ml var3 = null;
        var3 = (ml) (Object) ((fh) this).field_n.a(1, (long)param1);
        if (var3 != null) {
          return var3.c(false);
        } else {
          if (param0) {
            ((fh) this).field_d = -2;
            return 0;
          } else {
            return 0;
          }
        }
    }

    fh(int param0, sg param1, sg param2, na param3, cd param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((fh) this).field_n = new ab(16);
        ((fh) this).field_o = 0;
        ((fh) this).field_u = new oi();
        ((fh) this).field_h = 0L;
        try {
          L0: {
            L1: {
              ((fh) this).field_d = param0;
              ((fh) this).field_g = param1;
              if (null != ((fh) this).field_g) {
                ((fh) this).field_r = true;
                ((fh) this).field_p = new oi();
                break L1;
              } else {
                ((fh) this).field_r = false;
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
              ((fh) this).field_e = stackIn_7_1 != 0;
              ((fh) this).field_x = param6;
              ((fh) this).field_k = param7;
              ((fh) this).field_m = param2;
              ((fh) this).field_q = param4;
              ((fh) this).field_i = param3;
              ((fh) this).field_l = param5;
              if (null == ((fh) this).field_m) {
                break L3;
              } else {
                ((fh) this).field_v = (ml) (Object) ((fh) this).field_q.a(((fh) this).field_d, 1, ((fh) this).field_m);
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
            stackOut_10_1 = new StringBuilder().append("fh.<init>(").append(param0).append(',');
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
          throw bd.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new oi();
    }
}
