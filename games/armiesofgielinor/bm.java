/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends ew {
    private int field_r;
    private int field_j;
    static String field_z;
    static int field_p;
    private bc field_w;
    private bg field_t;
    private int field_B;
    private byte[] field_C;
    static rg field_D;
    private bp field_x;
    static String field_k;
    static int field_h;
    static int[][] field_y;
    private bc field_f;
    private byte[] field_g;
    private jm field_q;
    private ks field_n;
    private vo field_A;
    private int field_s;
    private at field_i;
    private boolean field_o;
    private boolean field_u;
    private at field_m;
    private boolean field_l;
    private long field_v;

    final void b(int param0) {
        ks var2 = null;
        int var2_int = 0;
        tc var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == -26132) {
          L0: {
            L1: {
              L2: {
                if (((bm) this).field_i == null) {
                  break L2;
                } else {
                  if (null != ((bm) this).a(param0 ^ -10433)) {
                    if (!((bm) this).field_o) {
                      if (((bm) this).field_u) {
                        var2_int = 1;
                        var3 = ((bm) this).field_i.e((byte) 92);
                        L3: while (true) {
                          if (var3 == null) {
                            L4: while (true) {
                              L5: {
                                if (((bm) this).field_q.field_p.length <= ((bm) this).field_s) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (0 == ((bm) this).field_q.field_p[((bm) this).field_s]) {
                                      break L6;
                                    } else {
                                      if (((bm) this).field_x.a((byte) 51)) {
                                        var2_int = 0;
                                        break L5;
                                      } else {
                                        L7: {
                                          if (((bm) this).field_C[((bm) this).field_s] == 1) {
                                            break L7;
                                          } else {
                                            ks discarded$4 = this.a(1, ((bm) this).field_s, 2);
                                            break L7;
                                          }
                                        }
                                        if (((bm) this).field_C[((bm) this).field_s] != 1) {
                                          var3 = new tc();
                                          var3.field_i = (long)((bm) this).field_s;
                                          ((bm) this).field_i.a((byte) -119, var3);
                                          var2_int = 0;
                                          break L6;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                  ((bm) this).field_s = ((bm) this).field_s + 1;
                                  continue L4;
                                }
                              }
                              if (var2_int == 0) {
                                break L2;
                              } else {
                                ((bm) this).field_u = false;
                                ((bm) this).field_s = 0;
                                break L2;
                              }
                            }
                          } else {
                            L8: {
                              var4 = (int)var3.field_i;
                              if (1 == ((bm) this).field_C[var4]) {
                                break L8;
                              } else {
                                ks discarded$5 = this.a(1, var4, 2);
                                break L8;
                              }
                            }
                            L9: {
                              if (((bm) this).field_C[var4] != 1) {
                                var2_int = 0;
                                break L9;
                              } else {
                                var3.d(param0 ^ 26237);
                                break L9;
                              }
                            }
                            var3 = ((bm) this).field_i.a((byte) 123);
                            continue L3;
                          }
                        }
                      } else {
                        ((bm) this).field_i = null;
                        break L2;
                      }
                    } else {
                      var2_int = 1;
                      var3 = ((bm) this).field_i.e((byte) 101);
                      L10: while (true) {
                        if (var3 == null) {
                          L11: while (true) {
                            L12: {
                              if (((bm) this).field_s >= ((bm) this).field_q.field_p.length) {
                                break L12;
                              } else {
                                if (((bm) this).field_q.field_p[((bm) this).field_s] != 0) {
                                  if (250 <= ((bm) this).field_A.field_b) {
                                    var2_int = 0;
                                    break L12;
                                  } else {
                                    L13: {
                                      if (((bm) this).field_C[((bm) this).field_s] == 0) {
                                        ks discarded$6 = this.a(1, ((bm) this).field_s, 1);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (((bm) this).field_C[((bm) this).field_s] == 0) {
                                        var3 = new tc();
                                        var3.field_i = (long)((bm) this).field_s;
                                        var2_int = 0;
                                        ((bm) this).field_i.a((byte) -119, var3);
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    ((bm) this).field_s = ((bm) this).field_s + 1;
                                    continue L11;
                                  }
                                } else {
                                  ((bm) this).field_s = ((bm) this).field_s + 1;
                                  continue L11;
                                }
                              }
                            }
                            if (var2_int != 0) {
                              ((bm) this).field_s = 0;
                              ((bm) this).field_o = false;
                              break L2;
                            } else {
                              if (!((bm) this).field_l) {
                                break L0;
                              } else {
                                if (~((bm) this).field_v >= ~vi.b(param0 + 26060)) {
                                  var2 = (ks) (Object) ((bm) this).field_t.b(1);
                                  L15: while (true) {
                                    if (var2 == null) {
                                      break L1;
                                    } else {
                                      L16: {
                                        if (var2.field_x) {
                                          break L16;
                                        } else {
                                          if (var2.field_w) {
                                            if (!var2.field_z) {
                                              throw new RuntimeException();
                                            } else {
                                              var2.d(-128);
                                              break L16;
                                            }
                                          } else {
                                            var2.field_w = true;
                                            break L16;
                                          }
                                        }
                                      }
                                      var2 = (ks) (Object) ((bm) this).field_t.b((byte) 127);
                                      continue L15;
                                    }
                                  }
                                } else {
                                  break L0;
                                }
                              }
                            }
                          }
                        } else {
                          L17: {
                            var4 = (int)var3.field_i;
                            if (0 != ((bm) this).field_C[var4]) {
                              break L17;
                            } else {
                              ks discarded$7 = this.a(1, var4, 1);
                              break L17;
                            }
                          }
                          L18: {
                            if (((bm) this).field_C[var4] == 0) {
                              var2_int = 0;
                              break L18;
                            } else {
                              var3.d(-115);
                              break L18;
                            }
                          }
                          var3 = ((bm) this).field_i.a((byte) 123);
                          continue L10;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              if (!((bm) this).field_l) {
                break L0;
              } else {
                if (~((bm) this).field_v >= ~vi.b(param0 + 26060)) {
                  var2 = (ks) (Object) ((bm) this).field_t.b(1);
                  L19: while (true) {
                    if (var2 == null) {
                      break L1;
                    } else {
                      L20: {
                        if (var2.field_x) {
                          break L20;
                        } else {
                          if (var2.field_w) {
                            if (!var2.field_z) {
                              throw new RuntimeException();
                            } else {
                              var2.d(-128);
                              break L20;
                            }
                          } else {
                            var2.field_w = true;
                            break L20;
                          }
                        }
                      }
                      var2 = (ks) (Object) ((bm) this).field_t.b((byte) 127);
                      continue L19;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            ((bm) this).field_v = 1000L + vi.b(65);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final jm a(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((bm) this).field_q == null) {
          L0: {
            if (null == ((bm) this).field_n) {
              if (!((bm) this).field_x.d(101)) {
                ((bm) this).field_n = (ks) (Object) ((bm) this).field_x.a(((bm) this).field_r, false, 255, (byte) 0, true);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((bm) this).field_n.field_x) {
            L1: {
              var5 = ((bm) this).field_n.d((byte) -119);
              var2 = var5;
              if (!(((bm) this).field_n instanceof nh)) {
                try {
                  L2: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((bm) this).field_q = new jm(var5, ((bm) this).field_B, ((bm) this).field_g);
                      break L2;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    ((bm) this).field_x.b((byte) 4);
                    ((bm) this).field_q = null;
                    if (((bm) this).field_x.d(param0 + -20152)) {
                      ((bm) this).field_n = null;
                      break L3;
                    } else {
                      ((bm) this).field_n = (ks) (Object) ((bm) this).field_x.a(((bm) this).field_r, false, 255, (byte) 0, true);
                      break L3;
                    }
                  }
                  return null;
                }
                if (null != ((bm) this).field_f) {
                  nh discarded$1 = ((bm) this).field_A.a(((bm) this).field_r, ((bm) this).field_f, false, var5);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                try {
                  L4: {
                    if (var5 != null) {
                      ((bm) this).field_q = new jm(var5, ((bm) this).field_B, ((bm) this).field_g);
                      if (((bm) this).field_j != ((bm) this).field_q.field_c) {
                        throw new RuntimeException();
                      } else {
                        break L4;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var3 = decompiledCaughtException;
                    ((bm) this).field_q = null;
                    if (!((bm) this).field_x.d(92)) {
                      ((bm) this).field_n = (ks) (Object) ((bm) this).field_x.a(((bm) this).field_r, false, 255, (byte) 0, true);
                      break L5;
                    } else {
                      ((bm) this).field_n = null;
                      break L5;
                    }
                  }
                  return null;
                }
                break L1;
              }
            }
            L6: {
              ((bm) this).field_n = null;
              if (null != ((bm) this).field_w) {
                ((bm) this).field_C = new byte[((bm) this).field_q.field_i];
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param0 == 20179) {
                break L7;
              } else {
                field_k = null;
                break L7;
              }
            }
            return ((bm) this).field_q;
          } else {
            return null;
          }
        } else {
          return ((bm) this).field_q;
        }
    }

    private final ks a(int param0, int param1, int param2) {
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
        Object stackIn_56_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_55_0 = null;
        L0: {
          var10 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = (Object) (Object) (ks) (Object) ((bm) this).field_t.a(-67, (long)param1);
          if (var4 == null) {
            break L0;
          } else {
            if (0 != param2) {
              break L0;
            } else {
              if (((ks) var4).field_z) {
                break L0;
              } else {
                if (((ks) var4).field_x) {
                  ((ks) var4).d(35);
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
              if (param2 == 0) {
                L3: {
                  if (null == ((bm) this).field_w) {
                    break L3;
                  } else {
                    if (((bm) this).field_C[param1] == -1) {
                      break L3;
                    } else {
                      var4 = (Object) (Object) ((bm) this).field_A.a(param1, ((bm) this).field_w, 86);
                      break L2;
                    }
                  }
                }
                if (!((bm) this).field_x.d(64)) {
                  var4 = (Object) (Object) ((bm) this).field_x.a(param1, false, ((bm) this).field_r, (byte) 2, true);
                  break L2;
                } else {
                  return null;
                }
              } else {
                if (1 != param2) {
                  if (param2 != 2) {
                    throw new RuntimeException();
                  } else {
                    if (((bm) this).field_w != null) {
                      if (((bm) this).field_C[param1] == -1) {
                        if (!((bm) this).field_x.a((byte) 51)) {
                          var4 = (Object) (Object) ((bm) this).field_x.a(param1, false, ((bm) this).field_r, (byte) 2, false);
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
                } else {
                  if (((bm) this).field_w != null) {
                    var4 = (Object) (Object) ((bm) this).field_A.a((byte) 56, param1, ((bm) this).field_w);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
            ((bm) this).field_t.a((tc) var4, (long)param1, 108);
            break L1;
          }
        }
        if (!((ks) var4).field_x) {
          var5 = ((ks) var4).d((byte) -86);
          if (!(var4 instanceof nh)) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length > 2) {
                      ab.field_b.reset();
                      ab.field_b.update(var5, 0, var5.length + -2);
                      var6_int = (int)ab.field_b.getValue();
                      if (var6_int == ((bm) this).field_q.field_e[param1]) {
                        L6: {
                          if (null == ((bm) this).field_q.field_v) {
                            break L6;
                          } else {
                            if (((bm) this).field_q.field_v[param1] == null) {
                              break L6;
                            } else {
                              var7 = ((bm) this).field_q.field_v[param1];
                              var8 = ua.a(-18423, -2 + var5.length, var5, 0);
                              var11 = 0;
                              var9 = var11;
                              L7: while (true) {
                                if (var11 >= 64) {
                                  break L6;
                                } else {
                                  if (var7[var11] != var8[var11]) {
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
                        ((bm) this).field_x.field_q = 0;
                        ((bm) this).field_x.field_p = 0;
                        break L4;
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
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                ((bm) this).field_x.b((byte) 4);
                ((ks) var4).d(-109);
                if (((ks) var4).field_z) {
                  if (!((bm) this).field_x.d(59)) {
                    var4 = (Object) (Object) ((bm) this).field_x.a(param1, false, ((bm) this).field_r, (byte) 2, true);
                    ((bm) this).field_t.a((tc) var4, (long)param1, 120);
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
              var5[-2 + var5.length] = (byte)(((bm) this).field_q.field_t[param1] >>> 8);
              var5[-1 + var5.length] = (byte)((bm) this).field_q.field_t[param1];
              if (null == ((bm) this).field_w) {
                break L9;
              } else {
                nh discarded$1 = ((bm) this).field_A.a(param1, ((bm) this).field_w, false, var5);
                if (((bm) this).field_C[param1] != 1) {
                  ((bm) this).field_C[param1] = (byte) 1;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (((ks) var4).field_z) {
                break L10;
              } else {
                ((ks) var4).d(105);
                break L10;
              }
            }
            return (ks) var4;
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
                      ab.field_b.reset();
                      ab.field_b.update(var5, 0, -2 + var5.length);
                      var6_int = (int)ab.field_b.getValue();
                      if (var6_int != ((bm) this).field_q.field_e[param1]) {
                        throw new RuntimeException();
                      } else {
                        L13: {
                          if (((bm) this).field_q.field_v == null) {
                            break L13;
                          } else {
                            if (null != ((bm) this).field_q.field_v[param1]) {
                              var7 = ((bm) this).field_q.field_v[param1];
                              var8 = ua.a(-18423, -2 + var5.length, var5, 0);
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
                            } else {
                              break L13;
                            }
                          }
                        }
                        var7_int = (255 & var5[var5.length + -1]) + (65280 & var5[-2 + var5.length] << 8);
                        if ((65535 & ((bm) this).field_q.field_t[param1]) == var7_int) {
                          L15: {
                            if (((bm) this).field_C[param1] != -2) {
                              L16: {
                                if (-1 == ((bm) this).field_C[param1]) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              ((bm) this).field_C[param1] = (byte) 1;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L17: {
                            if (!((ks) var4).field_z) {
                              ((ks) var4).d(-100);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          stackOut_55_0 = var4;
                          stackIn_56_0 = stackOut_55_0;
                          break L11;
                        } else {
                          throw new RuntimeException();
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
                ((bm) this).field_C[param1] = (byte) -1;
                ((ks) var4).d(116);
                if (((ks) var4).field_z) {
                  if (!((bm) this).field_x.d(18)) {
                    var4 = (Object) (Object) ((bm) this).field_x.a(param1, false, ((bm) this).field_r, (byte) 2, true);
                    ((bm) this).field_t.a((tc) var4, (long)param1, 98);
                    break L18;
                  } else {
                    return null;
                  }
                } else {
                  break L18;
                }
              }
              return null;
            }
            return (ks) (Object) stackIn_56_0;
          }
        } else {
          return null;
        }
    }

    final static void a() {
    }

    final byte[] a(int param0, int param1) {
        ks var3 = this.a(1, param0, 0);
        if (var3 == null) {
            return null;
        }
        if (param1 != 4) {
            ((bm) this).b(-9);
        }
        byte[] var4 = var3.d((byte) -113);
        var3.d(121);
        return var4;
    }

    final int b(int param0, int param1) {
        ks var3 = (ks) (Object) ((bm) this).field_t.a(param0 + -5958, (long)param1);
        if (var3 != null) {
            return var3.g(0);
        }
        if (param0 != 5926) {
            return 68;
        }
        return 0;
    }

    public static void e(int param0) {
        field_k = null;
        field_D = null;
        if (param0 > -33) {
            return;
        }
        field_z = null;
        field_y = null;
    }

    final void c(int param0) {
        if (!(((bm) this).field_w != null)) {
            return;
        }
        ((bm) this).field_u = true;
        if (param0 != 31637) {
            jm discarded$0 = ((bm) this).a(-26);
        }
        if (!(null != ((bm) this).field_i)) {
            ((bm) this).field_i = new at();
        }
    }

    final void d(int param0) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((bm) this).field_i == null) {
            return;
        }
        if (!(null != ((bm) this).a(20179))) {
            return;
        }
        int var3 = 1 % ((72 - param0) / 39);
        tc var2 = ((bm) this).field_m.e((byte) 120);
        while (var2 != null) {
            var4 = (int)var2.field_i;
            if (var4 < 0) {
                var2.d(-111);
            } else {
                if (var4 >= ((bm) this).field_q.field_i) {
                    var2.d(-111);
                } else {
                    if (((bm) this).field_q.field_p[var4] == 0) {
                        var2.d(-111);
                    } else {
                        if (0 == ((bm) this).field_C[var4]) {
                            ks discarded$0 = this.a(1, var4, 1);
                        }
                        if (((bm) this).field_C[var4] == -1) {
                            ks discarded$1 = this.a(1, var4, 2);
                        }
                        if (1 == ((bm) this).field_C[var4]) {
                            var2.d(-121);
                        }
                    }
                }
            }
            var2 = ((bm) this).field_m.a((byte) 123);
        }
    }

    bm(int param0, bc param1, bc param2, bp param3, vo param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((bm) this).field_t = new bg(16);
        ((bm) this).field_s = 0;
        ((bm) this).field_m = new at();
        ((bm) this).field_v = 0L;
        try {
          L0: {
            L1: {
              ((bm) this).field_r = param0;
              ((bm) this).field_w = param1;
              if (((bm) this).field_w != null) {
                ((bm) this).field_o = true;
                ((bm) this).field_i = new at();
                break L1;
              } else {
                ((bm) this).field_o = false;
                break L1;
              }
            }
            L2: {
              ((bm) this).field_B = param5;
              ((bm) this).field_j = param7;
              ((bm) this).field_g = param6;
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
              ((bm) this).field_l = stackIn_7_1 != 0;
              ((bm) this).field_f = param2;
              ((bm) this).field_x = param3;
              ((bm) this).field_A = param4;
              if (null == ((bm) this).field_f) {
                break L3;
              } else {
                ((bm) this).field_n = (ks) (Object) ((bm) this).field_A.a(((bm) this).field_r, ((bm) this).field_f, 114);
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
            stackOut_10_1 = new StringBuilder().append("bm.<init>(").append(param0).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new int[][]{new int[2], new int[2], new int[2], new int[2]};
        field_z = "Connection lost - attempting to reconnect";
        field_k = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
