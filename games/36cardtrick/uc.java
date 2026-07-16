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
        Exception var6_ref_Exception = null;
        int var6 = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_62_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_61_0 = null;
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
                      if ((((uc) this).field_t[param1] ^ -1) != 0) {
                        throw new RuntimeException();
                      } else {
                        if (!((uc) this).field_v.c(param0 + -170)) {
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
                    if ((((uc) this).field_t[param1] ^ -1) != 0) {
                      var4 = (Object) (Object) ((uc) this).field_m.a(param0 ^ 125, ((uc) this).field_p, param1);
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
          L4: {
            var5 = ((la) var4).b(true);
            if (param0 == 124) {
              break L4;
            } else {
              ((uc) this).field_f = null;
              break L4;
            }
          }
          if (!(var4 instanceof ab)) {
            L5: {
              if (var5 == null) {
                break L5;
              } else {
                if (-3 > (var5.length ^ -1)) {
                  fl.field_c.reset();
                  fl.field_c.update(var5, 0, -2 + var5.length);
                  var6 = (int)fl.field_c.getValue();
                  if (((uc) this).field_l.field_i[param1] != var6) {
                    throw new RuntimeException();
                  } else {
                    L6: {
                      if (((uc) this).field_l.field_l == null) {
                        break L6;
                      } else {
                        if (((uc) this).field_l.field_l[param1] != null) {
                          var7 = ((uc) this).field_l.field_l[param1];
                          var8 = ti.a(0, var5, -2 + var5.length, 0);
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
                    L8: {
                      ((uc) this).field_v.field_b = 0;
                      ((uc) this).field_v.field_l = 0;
                      var5[-2 + var5.length] = (byte)(((uc) this).field_l.field_n[param1] >>> -948312632);
                      var5[-1 + var5.length] = (byte)((uc) this).field_l.field_n[param1];
                      if (null == ((uc) this).field_p) {
                        break L8;
                      } else {
                        ab discarded$1 = ((uc) this).field_m.a(((uc) this).field_p, var5, param1, param0 ^ -23043);
                        if ((((uc) this).field_t[param1] ^ -1) != -2) {
                          ((uc) this).field_t[param1] = (byte) 1;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (!((la) var4).field_o) {
                        ((la) var4).c(83);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return (la) var4;
                  }
                } else {
                  break L5;
                }
              }
            }
            throw new RuntimeException();
          } else {
            try {
              L10: {
                L11: {
                  if (var5 == null) {
                    break L11;
                  } else {
                    if (-3 <= (var5.length ^ -1)) {
                      break L11;
                    } else {
                      fl.field_c.reset();
                      fl.field_c.update(var5, 0, -2 + var5.length);
                      var6 = (int)fl.field_c.getValue();
                      if (((uc) this).field_l.field_i[param1] != var6) {
                        throw new RuntimeException();
                      } else {
                        L12: {
                          if (null == ((uc) this).field_l.field_l) {
                            break L12;
                          } else {
                            if (((uc) this).field_l.field_l[param1] != null) {
                              var7 = ((uc) this).field_l.field_l[param1];
                              var8 = ti.a(0, var5, var5.length - 2, param0 + -124);
                              var9 = 0;
                              L13: while (true) {
                                if (var9 >= 64) {
                                  break L12;
                                } else {
                                  if (var8[var9] != var7[var9]) {
                                    throw new RuntimeException();
                                  } else {
                                    var9++;
                                    continue L13;
                                  }
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                        }
                        var7_int = (var5[-1 + var5.length] & 255) + (65280 & var5[-2 + var5.length] << -67561912);
                        if ((65535 & ((uc) this).field_l.field_n[param1]) != var7_int) {
                          throw new RuntimeException();
                        } else {
                          L14: {
                            if (-2 == (((uc) this).field_t[param1] ^ -1)) {
                              break L14;
                            } else {
                              L15: {
                                if (((uc) this).field_t[param1] == 0) {
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              ((uc) this).field_t[param1] = (byte) 1;
                              break L14;
                            }
                          }
                          L16: {
                            if (!((la) var4).field_o) {
                              ((la) var4).c(param0 ^ 34);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          stackOut_61_0 = var4;
                          stackIn_62_0 = stackOut_61_0;
                          break L10;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L17: {
                var6_ref_Exception = (Exception) (Object) decompiledCaughtException;
                ((uc) this).field_t[param1] = (byte)-1;
                ((la) var4).c(param0 ^ 7);
                if (((la) var4).field_o) {
                  if (!((uc) this).field_v.a(false)) {
                    var4 = (Object) (Object) ((uc) this).field_v.a(true, -1640279264, param1, (byte) 2, ((uc) this).field_d);
                    ((uc) this).field_n.a((long)param1, (byte) 79, (qb) var4);
                    break L17;
                  } else {
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              return null;
            }
            return (la) (Object) stackIn_62_0;
          }
        } else {
          return null;
        }
    }

    final d b(byte param0) {
        byte[] var2 = null;
        int var4 = 0;
        byte[] var5 = null;
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
                if (var5 != null) {
                  ((uc) this).field_l = new d(var5, ((uc) this).field_k, ((uc) this).field_f);
                  if (null == ((uc) this).field_h) {
                    break L1;
                  } else {
                    ab discarded$2 = ((uc) this).field_m.a(((uc) this).field_h, var5, ((uc) this).field_d, -23167);
                    break L1;
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                if (var5 != null) {
                  ((uc) this).field_l = new d(var5, ((uc) this).field_k, ((uc) this).field_f);
                  if (((uc) this).field_l.field_k == ((uc) this).field_q) {
                    break L1;
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  throw new RuntimeException();
                }
              }
            }
            if (param0 <= -35) {
              L2: {
                ((uc) this).field_u = null;
                if (((uc) this).field_p != null) {
                  ((uc) this).field_t = new byte[((uc) this).field_l.field_b];
                  break L2;
                } else {
                  break L2;
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
                  if (-1 >= (var3 ^ -1)) {
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
                        if (-2 == (((uc) this).field_t[var3] ^ -1)) {
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
                                  if ((((uc) this).field_m.field_b ^ -1) <= -251) {
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
                          if (-1 == (((uc) this).field_t[var4] ^ -1)) {
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
                                      if ((((uc) this).field_t[((uc) this).field_c] ^ -1) != -2) {
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
                                if ((id.a(36) ^ -1L) > (((uc) this).field_i ^ -1L)) {
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
                            if (-2 != (((uc) this).field_t[var4] ^ -1)) {
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
              if ((id.a(36) ^ -1L) > (((uc) this).field_i ^ -1L)) {
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
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var10 = Main.field_T;
          var7 = qa.a(param2, 8);
          if (null == bl.field_a) {
            bl.field_a = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var8 = new int[4];
        var9 = 0;
        L1: while (true) {
          if (-5 >= (var9 ^ -1)) {
            L2: {
              L3: {
                if (vc.field_b == null) {
                  break L3;
                } else {
                  if (vc.field_b.field_g.length >= var7) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              vc.field_b = new pb(var7);
              break L2;
            }
            L4: {
              L5: {
                vc.field_b.field_i = 0;
                vc.field_b.a(param2, param4, param6, (byte) -121);
                vc.field_b.c(1442653008, var7);
                vc.field_b.a(var8, 8);
                if (null == oj.field_a) {
                  break L5;
                } else {
                  if ((oj.field_a.field_g.length ^ -1) <= -101) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              oj.field_a = new pb(100);
              break L4;
            }
            L6: {
              if (param3 == 0) {
                break L6;
              } else {
                uc.b(57);
                break L6;
              }
            }
            oj.field_a.field_i = 0;
            oj.field_a.b(-9469, 10);
            var11 = 0;
            var9 = var11;
            L7: while (true) {
              if (var11 >= 4) {
                oj.field_a.e(param2, 26040);
                oj.field_a.a(param1, param5, -15792);
                param0.a(oj.field_a.field_i, 0, oj.field_a.field_g, (byte) -84);
                param0.a(vc.field_b.field_i, 0, vc.field_b.field_g, (byte) -113);
                return;
              } else {
                oj.field_a.a(-246, var8[var11]);
                var11++;
                continue L7;
              }
            }
          } else {
            var8[var9] = bl.field_a.nextInt();
            var9++;
            continue L1;
          }
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
        ((uc) this).field_n = new vb(16);
        ((uc) this).field_c = 0;
        ((uc) this).field_e = new bk();
        ((uc) this).field_i = 0L;
        ((uc) this).field_d = param0;
        ((uc) this).field_p = param1;
        if (((uc) this).field_p != null) {
            ((uc) this).field_s = true;
            ((uc) this).field_j = new bk();
        } else {
            ((uc) this).field_s = false;
        }
        ((uc) this).field_m = param4;
        ((uc) this).field_k = param5;
        ((uc) this).field_f = param6;
        ((uc) this).field_h = param2;
        ((uc) this).field_g = param8 ? true : false;
        ((uc) this).field_q = param7;
        ((uc) this).field_v = param3;
        if (((uc) this).field_h != null) {
            ((uc) this).field_u = (la) (Object) ((uc) this).field_m.a(1, ((uc) this).field_h, ((uc) this).field_d);
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
