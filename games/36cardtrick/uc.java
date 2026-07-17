/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends pe {
    static String field_r;
    private int field_q;
    private int field_k;
    private gj field_m;
    private int field_d;
    private ch field_v;
    private hc field_p;
    private byte[] field_t;
    private la field_u;
    private byte[] field_f;
    private d field_l;
    static String field_o;
    private hc field_h;
    private vb field_n;
    private int field_c;
    private boolean field_s;
    private bk field_e;
    private boolean field_w;
    private bk field_j;
    private long field_i;
    private boolean field_g;

    private final la a(byte param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_60_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_59_0 = null;
        L0: {
          var10 = Main.field_T;
          var4 = (Object) (Object) (la) (Object) ((uc) this).field_n.a(false, (long)param1);
          if (var4 == null) {
            break L0;
          } else {
            if (0 != param2) {
              break L0;
            } else {
              if (((la) var4).field_o) {
                break L0;
              } else {
                if (!((la) var4).field_n) {
                  break L0;
                } else {
                  ((la) var4).c(98);
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
              if (param2 != 0) {
                if (1 != param2) {
                  if (param2 == 2) {
                    if (null != ((uc) this).field_p) {
                      if (((uc) this).field_t[param1] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((uc) this).field_v.c(-46)) {
                          var4 = (Object) (Object) ((uc) this).field_v.a(false, -1640279264, param1, (byte) 2, ((uc) this).field_d);
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
                  if (null != ((uc) this).field_p) {
                    var4 = (Object) (Object) ((uc) this).field_m.a(param1, -3, ((uc) this).field_p);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                L3: {
                  if (((uc) this).field_p == null) {
                    break L3;
                  } else {
                    if (((uc) this).field_t[param1] != -1) {
                      var4 = (Object) (Object) ((uc) this).field_m.a(1, ((uc) this).field_p, param1);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((uc) this).field_v.a(false)) {
                  var4 = (Object) (Object) ((uc) this).field_v.a(true, -1640279264, param1, (byte) 2, ((uc) this).field_d);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            ((uc) this).field_n.a((long)param1, (byte) 69, (qb) var4);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((la) var4).field_n) {
          var5 = ((la) var4).b(true);
          if (!(var4 instanceof ab)) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length > 2) {
                      fl.field_c.reset();
                      fl.field_c.update(var5, 0, -2 + var5.length);
                      var6_int = (int)fl.field_c.getValue();
                      if (((uc) this).field_l.field_i[param1] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L6: {
                          if (((uc) this).field_l.field_l == null) {
                            break L6;
                          } else {
                            if (((uc) this).field_l.field_l[param1] != null) {
                              var7 = ((uc) this).field_l.field_l[param1];
                              int discarded$3 = 0;
                              var8 = ti.a(0, var5, -2 + var5.length);
                              var11 = 0;
                              var9 = var11;
                              L7: while (true) {
                                if (64 <= var11) {
                                  break L6;
                                } else {
                                  if (var8[var11] != var7[var11]) {
                                    throw new RuntimeException();
                                  } else {
                                    var11++;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        ((uc) this).field_v.field_b = 0;
                        ((uc) this).field_v.field_l = 0;
                        break L4;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                ((uc) this).field_v.c((byte) 0);
                ((la) var4).c(82);
                if (((la) var4).field_o) {
                  if (!((uc) this).field_v.a(false)) {
                    var4 = (Object) (Object) ((uc) this).field_v.a(true, -1640279264, param1, (byte) 2, ((uc) this).field_d);
                    ((uc) this).field_n.a((long)param1, (byte) 110, (qb) var4);
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
              var5[-2 + var5.length] = (byte)(((uc) this).field_l.field_n[param1] >>> 8);
              var5[-1 + var5.length] = (byte)((uc) this).field_l.field_n[param1];
              if (null == ((uc) this).field_p) {
                break L9;
              } else {
                ab discarded$4 = ((uc) this).field_m.a(((uc) this).field_p, var5, param1, -23167);
                if (((uc) this).field_t[param1] != 1) {
                  ((uc) this).field_t[param1] = (byte) 1;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (!((la) var4).field_o) {
                ((la) var4).c(83);
                break L10;
              } else {
                break L10;
              }
            }
            return (la) var4;
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
                      fl.field_c.reset();
                      fl.field_c.update(var5, 0, -2 + var5.length);
                      var6_int = (int)fl.field_c.getValue();
                      if (((uc) this).field_l.field_i[param1] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L13: {
                          if (null == ((uc) this).field_l.field_l) {
                            break L13;
                          } else {
                            if (((uc) this).field_l.field_l[param1] != null) {
                              var7 = ((uc) this).field_l.field_l[param1];
                              int discarded$5 = 0;
                              var8 = ti.a(0, var5, var5.length - 2);
                              var9 = 0;
                              L14: while (true) {
                                if (var9 >= 64) {
                                  break L13;
                                } else {
                                  if (var8[var9] != var7[var9]) {
                                    throw new RuntimeException();
                                  } else {
                                    var9++;
                                    continue L14;
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        var7_int = (var5[-1 + var5.length] & 255) + (65280 & var5[-2 + var5.length] << 8);
                        if ((65535 & ((uc) this).field_l.field_n[param1]) != var7_int) {
                          throw new RuntimeException();
                        } else {
                          L15: {
                            if (((uc) this).field_t[param1] == 1) {
                              break L15;
                            } else {
                              L16: {
                                if (((uc) this).field_t[param1] == 0) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              ((uc) this).field_t[param1] = (byte) 1;
                              break L15;
                            }
                          }
                          L17: {
                            if (!((la) var4).field_o) {
                              ((la) var4).c(94);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          stackOut_59_0 = var4;
                          stackIn_60_0 = stackOut_59_0;
                          break L11;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L18: {
                var6 = (Exception) (Object) decompiledCaughtException;
                ((uc) this).field_t[param1] = (byte) -1;
                ((la) var4).c(123);
                if (((la) var4).field_o) {
                  if (!((uc) this).field_v.a(false)) {
                    var4 = (Object) (Object) ((uc) this).field_v.a(true, -1640279264, param1, (byte) 2, ((uc) this).field_d);
                    ((uc) this).field_n.a((long)param1, (byte) 79, (qb) var4);
                    break L18;
                  } else {
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
              return null;
            }
            return (la) (Object) stackIn_60_0;
          }
        } else {
          return null;
        }
    }

    final d b(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        if (((uc) this).field_l == null) {
          L0: {
            if (((uc) this).field_u != null) {
              break L0;
            } else {
              if (!((uc) this).field_v.a(false)) {
                ((uc) this).field_u = (la) (Object) ((uc) this).field_v.a(true, -1640279264, ((uc) this).field_d, (byte) 0, 255);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((uc) this).field_u.field_n) {
            L1: {
              var5 = ((uc) this).field_u.b(true);
              var2 = var5;
              if (!(((uc) this).field_u instanceof ab)) {
                try {
                  L2: {
                    if (var5 != null) {
                      ((uc) this).field_l = new d(var5, ((uc) this).field_k, ((uc) this).field_f);
                      break L2;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    ((uc) this).field_v.c((byte) 0);
                    ((uc) this).field_l = null;
                    if (((uc) this).field_v.a(false)) {
                      ((uc) this).field_u = null;
                      break L3;
                    } else {
                      ((uc) this).field_u = (la) (Object) ((uc) this).field_v.a(true, -1640279264, ((uc) this).field_d, (byte) 0, 255);
                      break L3;
                    }
                  }
                  return null;
                }
                if (null == ((uc) this).field_h) {
                  break L1;
                } else {
                  ab discarded$1 = ((uc) this).field_m.a(((uc) this).field_h, var5, ((uc) this).field_d, -23167);
                  break L1;
                }
              } else {
                try {
                  L4: {
                    if (var5 != null) {
                      ((uc) this).field_l = new d(var5, ((uc) this).field_k, ((uc) this).field_f);
                      if (((uc) this).field_l.field_k == ((uc) this).field_q) {
                        break L4;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var3 = decompiledCaughtException;
                    ((uc) this).field_l = null;
                    if (((uc) this).field_v.a(false)) {
                      ((uc) this).field_u = null;
                      break L5;
                    } else {
                      ((uc) this).field_u = (la) (Object) ((uc) this).field_v.a(true, -1640279264, ((uc) this).field_d, (byte) 0, 255);
                      break L5;
                    }
                  }
                  return null;
                }
                break L1;
              }
            }
            if (param0 <= -35) {
              L6: {
                ((uc) this).field_u = null;
                if (((uc) this).field_p != null) {
                  ((uc) this).field_t = new byte[((uc) this).field_l.field_b];
                  break L6;
                } else {
                  break L6;
                }
              }
              return ((uc) this).field_l;
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return ((uc) this).field_l;
        }
    }

    final void c(byte param0) {
        qb var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Main.field_T;
          if (param0 >= 89) {
            break L0;
          } else {
            ((uc) this).c((byte) -55);
            break L0;
          }
        }
        if (null == ((uc) this).field_j) {
          return;
        } else {
          if (((uc) this).b((byte) -71) == null) {
            return;
          } else {
            var2 = ((uc) this).field_e.a((byte) 74);
            L1: while (true) {
              if (var2 == null) {
                return;
              } else {
                L2: {
                  var3 = (int)var2.field_e;
                  if (var3 >= 0) {
                    if (var3 < ((uc) this).field_l.field_b) {
                      if (((uc) this).field_l.field_q[var3] == 0) {
                        var2.c(109);
                        break L2;
                      } else {
                        L3: {
                          if (0 != ((uc) this).field_t[var3]) {
                            break L3;
                          } else {
                            la discarded$2 = this.a((byte) 124, var3, 1);
                            break L3;
                          }
                        }
                        L4: {
                          if (((uc) this).field_t[var3] != -1) {
                            break L4;
                          } else {
                            la discarded$3 = this.a((byte) 124, var3, 2);
                            break L4;
                          }
                        }
                        if (((uc) this).field_t[var3] == 1) {
                          var2.c(85);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      var2.c(109);
                      break L2;
                    }
                  } else {
                    var2.c(109);
                    break L2;
                  }
                }
                var2 = ((uc) this).field_e.b((byte) -99);
                continue L1;
              }
            }
          }
        }
    }

    final void c(int param0) {
        int var2_int = 0;
        la var2 = null;
        qb var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            L2: {
              var5 = Main.field_T;
              if (null != ((uc) this).field_j) {
                if (((uc) this).b((byte) -56) == null) {
                  return;
                } else {
                  if (((uc) this).field_s) {
                    var2_int = 1;
                    var3 = ((uc) this).field_j.a((byte) 74);
                    L3: while (true) {
                      if (var3 == null) {
                        L4: while (true) {
                          L5: {
                            if (((uc) this).field_l.field_q.length <= ((uc) this).field_c) {
                              break L5;
                            } else {
                              L6: {
                                if (((uc) this).field_l.field_q[((uc) this).field_c] == 0) {
                                  break L6;
                                } else {
                                  if (((uc) this).field_m.field_b >= 250) {
                                    var2_int = 0;
                                    break L5;
                                  } else {
                                    L7: {
                                      if (0 == ((uc) this).field_t[((uc) this).field_c]) {
                                        la discarded$4 = this.a((byte) 124, ((uc) this).field_c, 1);
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    if (((uc) this).field_t[((uc) this).field_c] == 0) {
                                      var3 = new qb();
                                      var3.field_e = (long)((uc) this).field_c;
                                      var2_int = 0;
                                      ((uc) this).field_j.a(var3, param0 + 30390);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              ((uc) this).field_c = ((uc) this).field_c + 1;
                              continue L4;
                            }
                          }
                          if (var2_int == 0) {
                            break L2;
                          } else {
                            ((uc) this).field_s = false;
                            ((uc) this).field_c = 0;
                            break L2;
                          }
                        }
                      } else {
                        L8: {
                          var4 = (int)var3.field_e;
                          if (((uc) this).field_t[var4] != 0) {
                            break L8;
                          } else {
                            la discarded$5 = this.a((byte) 124, var4, 1);
                            break L8;
                          }
                        }
                        L9: {
                          if (((uc) this).field_t[var4] == 0) {
                            var2_int = 0;
                            break L9;
                          } else {
                            var3.c(98);
                            break L9;
                          }
                        }
                        var3 = ((uc) this).field_j.b((byte) -101);
                        continue L3;
                      }
                    }
                  } else {
                    if (((uc) this).field_w) {
                      var2_int = 1;
                      var3 = ((uc) this).field_j.a((byte) 74);
                      L10: while (true) {
                        if (var3 == null) {
                          L11: while (true) {
                            L12: {
                              if (((uc) this).field_l.field_q.length <= ((uc) this).field_c) {
                                break L12;
                              } else {
                                L13: {
                                  if (((uc) this).field_l.field_q[((uc) this).field_c] == 0) {
                                    break L13;
                                  } else {
                                    if (((uc) this).field_v.c(param0 + 3129)) {
                                      var2_int = 0;
                                      break L12;
                                    } else {
                                      L14: {
                                        if (((uc) this).field_t[((uc) this).field_c] != 1) {
                                          la discarded$6 = this.a((byte) 124, ((uc) this).field_c, 2);
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      if (((uc) this).field_t[((uc) this).field_c] != 1) {
                                        var3 = new qb();
                                        var3.field_e = (long)((uc) this).field_c;
                                        ((uc) this).field_j.a(var3, 27362);
                                        var2_int = 0;
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                                ((uc) this).field_c = ((uc) this).field_c + 1;
                                continue L11;
                              }
                            }
                            if (var2_int != 0) {
                              ((uc) this).field_c = 0;
                              ((uc) this).field_w = false;
                              break L2;
                            } else {
                              if (!((uc) this).field_g) {
                                break L0;
                              } else {
                                if (~id.a(36) > ~((uc) this).field_i) {
                                  break L0;
                                } else {
                                  var2 = (la) (Object) ((uc) this).field_n.b(-119);
                                  L15: while (true) {
                                    if (var2 == null) {
                                      break L1;
                                    } else {
                                      L16: {
                                        if (!var2.field_n) {
                                          if (var2.field_l) {
                                            if (!var2.field_o) {
                                              throw new RuntimeException();
                                            } else {
                                              var2.c(86);
                                              break L16;
                                            }
                                          } else {
                                            var2.field_l = true;
                                            break L16;
                                          }
                                        } else {
                                          break L16;
                                        }
                                      }
                                      var2 = (la) (Object) ((uc) this).field_n.a(true);
                                      continue L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L17: {
                            var4 = (int)var3.field_e;
                            if (1 != ((uc) this).field_t[var4]) {
                              la discarded$7 = this.a((byte) 124, var4, 2);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L18: {
                            if (((uc) this).field_t[var4] != 1) {
                              var2_int = 0;
                              break L18;
                            } else {
                              var3.c(124);
                              break L18;
                            }
                          }
                          var3 = ((uc) this).field_j.b((byte) -104);
                          continue L10;
                        }
                      }
                    } else {
                      ((uc) this).field_j = null;
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            if (!((uc) this).field_g) {
              break L0;
            } else {
              if (~id.a(36) > ~((uc) this).field_i) {
                break L0;
              } else {
                var2 = (la) (Object) ((uc) this).field_n.b(-119);
                L19: while (true) {
                  if (var2 == null) {
                    break L1;
                  } else {
                    L20: {
                      if (!var2.field_n) {
                        if (var2.field_l) {
                          if (!var2.field_o) {
                            throw new RuntimeException();
                          } else {
                            var2.c(86);
                            break L20;
                          }
                        } else {
                          var2.field_l = true;
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                    var2 = (la) (Object) ((uc) this).field_n.a(true);
                    continue L19;
                  }
                }
              }
            }
          }
          ((uc) this).field_i = 1000L + id.a(109);
          break L0;
        }
        L21: {
          if (param0 == -3028) {
            break L21;
          } else {
            ((uc) this).field_v = null;
            break L21;
          }
        }
    }

    final static void a(pb param0, java.math.BigInteger param1, int param2, byte param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var10 = Main.field_T;
        try {
          L0: {
            L1: {
              var7_int = qa.a(param2, 8);
              if (null == bl.field_a) {
                bl.field_a = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var8 = new int[4];
            var9 = 0;
            L2: while (true) {
              if (var9 >= 4) {
                L3: {
                  L4: {
                    if (vc.field_b == null) {
                      break L4;
                    } else {
                      if (vc.field_b.field_g.length >= var7_int) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  vc.field_b = new pb(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    vc.field_b.field_i = 0;
                    vc.field_b.a(param2, param4, param6, (byte) -121);
                    vc.field_b.c(1442653008, var7_int);
                    vc.field_b.a(var8, 8);
                    if (null == oj.field_a) {
                      break L6;
                    } else {
                      if (oj.field_a.field_g.length >= 100) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  oj.field_a = new pb(100);
                  break L5;
                }
                L7: {
                  if (param3 == 0) {
                    break L7;
                  } else {
                    uc.b(57);
                    break L7;
                  }
                }
                oj.field_a.field_i = 0;
                oj.field_a.b(-9469, 10);
                var11 = 0;
                var9 = var11;
                L8: while (true) {
                  if (var11 >= 4) {
                    oj.field_a.e(param2, 26040);
                    oj.field_a.a(param1, param5, -15792);
                    param0.a(oj.field_a.field_i, 0, oj.field_a.field_g, (byte) -84);
                    param0.a(vc.field_b.field_i, 0, vc.field_b.field_g, (byte) -113);
                    break L0;
                  } else {
                    oj.field_a.a(-246, var8[var11]);
                    var11++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = bl.field_a.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("uc.H(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param5 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          L12: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param6 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
    }

    public static void b(int param0) {
        field_r = null;
        field_o = null;
        if (param0 != 0) {
            uc.a((pb) null, (java.math.BigInteger) null, 16, (byte) 108, 83, (java.math.BigInteger) null, (byte[]) null);
        }
    }

    final int a(int param0, int param1) {
        la var3 = (la) (Object) ((uc) this).field_n.a(false, (long)param0);
        if (!(var3 == null)) {
            return var3.a(false);
        }
        int var4 = 10 / ((-27 - param1) / 58);
        return 0;
    }

    final void a(int param0) {
        if (!(((uc) this).field_p != null)) {
            return;
        }
        ((uc) this).field_w = true;
        if (null == ((uc) this).field_j) {
            ((uc) this).field_j = new bk();
        }
        if (param0 != -25350) {
            ((uc) this).field_m = null;
        }
    }

    final byte[] a(int param0, boolean param1) {
        la var3 = this.a((byte) 124, param0, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.b(param1);
        var3.c(109);
        return var4;
    }

    uc(int param0, hc param1, hc param2, ch param3, gj param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((uc) this).field_n = new vb(16);
        ((uc) this).field_c = 0;
        ((uc) this).field_e = new bk();
        ((uc) this).field_i = 0L;
        try {
          L0: {
            L1: {
              ((uc) this).field_d = param0;
              ((uc) this).field_p = param1;
              if (((uc) this).field_p == null) {
                ((uc) this).field_s = false;
                break L1;
              } else {
                ((uc) this).field_s = true;
                ((uc) this).field_j = new bk();
                break L1;
              }
            }
            L2: {
              ((uc) this).field_m = param4;
              ((uc) this).field_k = param5;
              ((uc) this).field_f = param6;
              ((uc) this).field_h = param2;
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
              ((uc) this).field_g = stackIn_7_1 != 0;
              ((uc) this).field_q = param7;
              ((uc) this).field_v = param3;
              if (((uc) this).field_h == null) {
                break L3;
              } else {
                ((uc) this).field_u = (la) (Object) ((uc) this).field_m.a(1, ((uc) this).field_h, ((uc) this).field_d);
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
            stackOut_10_1 = new StringBuilder().append("uc.<init>(").append(param0).append(44);
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
          throw ma.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Back";
        field_o = "TIME";
    }
}
