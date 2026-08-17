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
        ks discarded$0 = null;
        ks discarded$1 = null;
        ks discarded$2 = null;
        ks discarded$3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var2_int = 0;
        ks var2_ref = null;
        RuntimeException var2_ref2 = null;
        tc var3 = null;
        int var4 = 0;
        int var5 = 0;
        tc var6 = null;
        tc var7 = null;
        var2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 == -26132) {
              L1: {
                if (this.field_i == null) {
                  break L1;
                } else {
                  if (null != this.a(param0 ^ -10433)) {
                    if (!this.field_o) {
                      if (this.field_u) {
                        var2_int = 1;
                        var3 = this.field_i.e((byte) 92);
                        L2: while (true) {
                          if (var3 == null) {
                            L3: while (true) {
                              L4: {
                                if (this.field_q.field_p.length <= this.field_s) {
                                  break L4;
                                } else {
                                  L5: {
                                    if (0 == this.field_q.field_p[this.field_s]) {
                                      break L5;
                                    } else {
                                      if (this.field_x.a((byte) 51)) {
                                        var2_int = 0;
                                        break L4;
                                      } else {
                                        L6: {
                                          if ((this.field_C[this.field_s] ^ -1) == -2) {
                                            break L6;
                                          } else {
                                            discarded$0 = this.a(1, this.field_s, 2);
                                            break L6;
                                          }
                                        }
                                        if (this.field_C[this.field_s] != 1) {
                                          var7 = new tc();
                                          var7.field_i = (long)this.field_s;
                                          this.field_i.a((byte) -119, var7);
                                          var2_int = 0;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                  this.field_s = this.field_s + 1;
                                  continue L3;
                                }
                              }
                              if (var2_int == 0) {
                                break L1;
                              } else {
                                this.field_u = false;
                                this.field_s = 0;
                                break L1;
                              }
                            }
                          } else {
                            L7: {
                              var4 = (int)var3.field_i;
                              if (1 == this.field_C[var4]) {
                                break L7;
                              } else {
                                discarded$1 = this.a(1, var4, 2);
                                break L7;
                              }
                            }
                            L8: {
                              if (-2 != (this.field_C[var4] ^ -1)) {
                                var2_int = 0;
                                break L8;
                              } else {
                                var3.d(param0 ^ 26237);
                                break L8;
                              }
                            }
                            var3 = this.field_i.a((byte) 123);
                            continue L2;
                          }
                        }
                      } else {
                        this.field_i = null;
                        break L1;
                      }
                    } else {
                      var2_int = 1;
                      var3 = this.field_i.e((byte) 101);
                      L9: while (true) {
                        if (var3 == null) {
                          L10: while (true) {
                            L11: {
                              if (this.field_s >= this.field_q.field_p.length) {
                                break L11;
                              } else {
                                if ((this.field_q.field_p[this.field_s] ^ -1) != -1) {
                                  if (250 <= this.field_A.field_b) {
                                    var2_int = 0;
                                    break L11;
                                  } else {
                                    L12: {
                                      if (-1 == (this.field_C[this.field_s] ^ -1)) {
                                        discarded$2 = this.a(1, this.field_s, 1);
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      if (this.field_C[this.field_s] == 0) {
                                        var6 = new tc();
                                        var6.field_i = (long)this.field_s;
                                        var2_int = 0;
                                        this.field_i.a((byte) -119, var6);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    this.field_s = this.field_s + 1;
                                    continue L10;
                                  }
                                } else {
                                  this.field_s = this.field_s + 1;
                                  continue L10;
                                }
                              }
                            }
                            if (var2_int != 0) {
                              this.field_s = 0;
                              this.field_o = false;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        } else {
                          L14: {
                            var4 = (int)var3.field_i;
                            if (0 != this.field_C[var4]) {
                              break L14;
                            } else {
                              discarded$3 = this.a(1, var4, 1);
                              break L14;
                            }
                          }
                          L15: {
                            if (this.field_C[var4] == 0) {
                              var2_int = 0;
                              break L15;
                            } else {
                              var3.d(-115);
                              break L15;
                            }
                          }
                          var3 = this.field_i.a((byte) 123);
                          continue L9;
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L16: {
                L17: {
                  if (!this.field_l) {
                    break L17;
                  } else {
                    if ((this.field_v ^ -1L) >= (vi.b(param0 + 26060) ^ -1L)) {
                      var2_ref = (ks) ((Object) this.field_t.b(1));
                      L18: while (true) {
                        if (var2_ref == null) {
                          this.field_v = 1000L + vi.b(65);
                          break L17;
                        } else {
                          L19: {
                            if (var2_ref.field_x) {
                              break L19;
                            } else {
                              if (var2_ref.field_w) {
                                if (!var2_ref.field_z) {
                                  throw new RuntimeException();
                                } else {
                                  var2_ref.d(-128);
                                  break L19;
                                }
                              } else {
                                var2_ref.field_w = true;
                                break L19;
                              }
                            }
                          }
                          var2_ref = (ks) ((Object) this.field_t.b((byte) 127));
                          continue L18;
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                break L16;
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref2), "bm.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final jm a(int param0) {
        jm stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_41_0 = null;
        jm stackIn_53_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.field_q == null) {
              L1: {
                if (null == this.field_n) {
                  if (!this.field_x.d(101)) {
                    this.field_n = (ks) ((Object) this.field_x.a(this.field_r, false, 255, (byte) 0, true));
                    break L1;
                  } else {
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              if (!this.field_n.field_x) {
                L2: {
                  var7 = this.field_n.d((byte) -119);
                  var6 = var7;
                  var5 = var6;
                  var2 = var5;
                  if (!(this.field_n instanceof nh)) {
                    try {
                      L3: {
                        if (var5 == null) {
                          throw new RuntimeException();
                        } else {
                          this.field_q = new jm(var7, this.field_B, this.field_g);
                          break L3;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var3 = decompiledCaughtException;
                        this.field_x.b((byte) 4);
                        this.field_q = null;
                        if (this.field_x.d(param0 + -20152)) {
                          this.field_n = null;
                          break L4;
                        } else {
                          this.field_n = (ks) ((Object) this.field_x.a(this.field_r, false, 255, (byte) 0, true));
                          break L4;
                        }
                      }
                      stackIn_41_0 = null;
                      return (jm) ((Object) stackIn_41_0);
                    }
                    if (null != this.field_f) {
                      this.field_A.a(this.field_r, this.field_f, false, var7);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    try {
                      L5: {
                        if (var5 != null) {
                          this.field_q = new jm(var7, this.field_B, this.field_g);
                          if (this.field_j != this.field_q.field_c) {
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
                        this.field_q = null;
                        if (!this.field_x.d(92)) {
                          this.field_n = (ks) ((Object) this.field_x.a(this.field_r, false, 255, (byte) 0, true));
                          break L6;
                        } else {
                          this.field_n = null;
                          break L6;
                        }
                      }
                      stackIn_29_0 = null;
                      return (jm) ((Object) stackIn_29_0);
                    }
                    break L2;
                  }
                }
                L7: {
                  this.field_n = null;
                  if (null != this.field_w) {
                    this.field_C = new byte[this.field_q.field_i];
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param0 == 20179) {
                    break L8;
                  } else {
                    field_k = (String) null;
                    break L8;
                  }
                }
                stackIn_53_0 = this.field_q;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_3_0 = this.field_q;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "bm.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (jm) ((Object) stackIn_9_0);
          } else {
            return stackIn_53_0;
          }
        }
    }

    private final ks a(int param0, int param1, int param2) {
        ks stackIn_3_0 = null;
        Object stackIn_76_0 = null;
        Object stackIn_84_0 = null;
        Object stackIn_112_0 = null;
        Object stackIn_120_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ks var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 == 1) {
              L1: {
                var12 = (ks) ((Object) this.field_t.a(-67, (long)param1));
                var4 = var12;
                if (var12 == null) {
                  break L1;
                } else {
                  if (0 != param2) {
                    break L1;
                  } else {
                    if (var12.field_z) {
                      break L1;
                    } else {
                      if (var12.field_x) {
                        var12.d(35);
                        var4 = null;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L2: {
                if (var4 != null) {
                  break L2;
                } else {
                  L3: {
                    if (param2 == 0) {
                      L4: {
                        if (null == this.field_w) {
                          break L4;
                        } else {
                          if (0 == (this.field_C[param1] ^ -1)) {
                            break L4;
                          } else {
                            var4 = this.field_A.a(param1, this.field_w, 86);
                            break L3;
                          }
                        }
                      }
                      if (!this.field_x.d(64)) {
                        var4 = this.field_x.a(param1, false, this.field_r, (byte) 2, true);
                        break L3;
                      } else {
                        return null;
                      }
                    } else {
                      if (1 != param2) {
                        if (-3 != (param2 ^ -1)) {
                          throw new RuntimeException();
                        } else {
                          if (this.field_w != null) {
                            if (this.field_C[param1] == -1) {
                              if (!this.field_x.a((byte) 51)) {
                                var4 = this.field_x.a(param1, false, this.field_r, (byte) 2, false);
                                break L3;
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
                        if (this.field_w != null) {
                          var4 = this.field_A.a((byte) 56, param1, this.field_w);
                          break L3;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                  this.field_t.a((tc) (var4), (long)param1, 108);
                  break L2;
                }
              }
              if (!((ks) (var4)).field_x) {
                var18 = ((ks) (var4)).d((byte) -86);
                var13 = var18;
                var5 = var13;
                if (!(var4 instanceof nh)) {
                  try {
                    L5: {
                      L6: {
                        if (var5 == null) {
                          break L6;
                        } else {
                          if ((var18.length ^ -1) < -3) {
                            ab.field_b.reset();
                            ab.field_b.update(var5, 0, var18.length + -2);
                            var6_int = (int)ab.field_b.getValue();
                            if (var6_int == this.field_q.field_e[param1]) {
                              L7: {
                                if (null == this.field_q.field_v) {
                                  break L7;
                                } else {
                                  if (this.field_q.field_v[param1] == null) {
                                    break L7;
                                  } else {
                                    var29 = this.field_q.field_v[param1];
                                    var30 = ua.a(-18423, -2 + var18.length, var18, 0);
                                    var11 = 0;
                                    var9 = var11;
                                    L8: while (true) {
                                      if ((var11 ^ -1) <= -65) {
                                        break L7;
                                      } else {
                                        if (var29[var11] != var30[var11]) {
                                          throw new RuntimeException();
                                        } else {
                                          var11++;
                                          continue L8;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              this.field_x.field_q = 0;
                              this.field_x.field_p = 0;
                              break L5;
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L9: {
                      var6 = (RuntimeException) (Object) decompiledCaughtException;
                      this.field_x.b((byte) 4);
                      ((ks) (var4)).d(-109);
                      if (((ks) (var4)).field_z) {
                        if (!this.field_x.d(59)) {
                          var4 = this.field_x.a(param1, false, this.field_r, (byte) 2, true);
                          this.field_t.a((tc) (var4), (long)param1, 120);
                          break L9;
                        } else {
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    }
                    stackIn_112_0 = null;
                    return (ks) ((Object) stackIn_112_0);
                  }
                  L10: {
                    var5[-2 + var18.length] = (byte)(this.field_q.field_t[param1] >>> -1066328536);
                    var5[-1 + var18.length] = (byte)this.field_q.field_t[param1];
                    if (null == this.field_w) {
                      break L10;
                    } else {
                      this.field_A.a(param1, this.field_w, false, var18);
                      if (this.field_C[param1] != 1) {
                        this.field_C[param1] = (byte) 1;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (((ks) (var4)).field_z) {
                      break L11;
                    } else {
                      ((ks) (var4)).d(105);
                      break L11;
                    }
                  }
                  stackIn_120_0 = var4;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  try {
                    L12: {
                      L13: {
                        if (var5 == null) {
                          break L13;
                        } else {
                          if (-3 <= (var18.length ^ -1)) {
                            break L13;
                          } else {
                            ab.field_b.reset();
                            ab.field_b.update(var5, 0, -2 + var18.length);
                            var6_int = (int)ab.field_b.getValue();
                            if (var6_int != this.field_q.field_e[param1]) {
                              throw new RuntimeException();
                            } else {
                              L14: {
                                if (this.field_q.field_v == null) {
                                  break L14;
                                } else {
                                  if (null != this.field_q.field_v[param1]) {
                                    var27 = this.field_q.field_v[param1];
                                    var28 = ua.a(param0 ^ -18424, -2 + var18.length, var18, 0);
                                    var9 = 0;
                                    L15: while (true) {
                                      if (var9 >= 64) {
                                        break L14;
                                      } else {
                                        if ((var27[var9] ^ -1) == (var28[var9] ^ -1)) {
                                          var9++;
                                          continue L15;
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              var7 = (255 & var5[var18.length + -1]) + (65280 & var5[-2 + var18.length] << -2019534360);
                              if ((65535 & this.field_q.field_t[param1]) == var7) {
                                L16: {
                                  if ((this.field_C[param1] ^ -1) != -2) {
                                    L17: {
                                      if (-1 == (this.field_C[param1] ^ -1)) {
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    this.field_C[param1] = (byte) 1;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                L18: {
                                  if (!((ks) (var4)).field_z) {
                                    ((ks) (var4)).d(param0 ^ -99);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                stackIn_76_0 = var4;
                                break L12;
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
                    L19: {
                      var6_ref = (Exception) (Object) decompiledCaughtException;
                      this.field_C[param1] = (byte)-1;
                      ((ks) (var4)).d(116);
                      if (((ks) (var4)).field_z) {
                        if (!this.field_x.d(18)) {
                          var4 = this.field_x.a(param1, false, this.field_r, (byte) 2, true);
                          this.field_t.a((tc) (var4), (long)param1, 98);
                          break L19;
                        } else {
                          return null;
                        }
                      } else {
                        break L19;
                      }
                    }
                    stackIn_84_0 = null;
                    return (ks) ((Object) stackIn_84_0);
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              stackIn_3_0 = (ks) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw ig.a((Throwable) (var4), "bm.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ks) ((Object) stackIn_120_0);
          } else {
            return (ks) ((Object) stackIn_76_0);
          }
        }
    }

    final static void a(byte param0, int param1) {
        try {
            if (param0 > -43) {
                bm.e(41);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "bm.J(" + param0 + ',' + param1 + ')');
        }
    }

    final byte[] a(int param0, int param1) {
        ks var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.a(1, param0, 0);
            if (var3 != null) {
              L1: {
                if (param1 == 4) {
                  break L1;
                } else {
                  this.b(-9);
                  break L1;
                }
              }
              var4 = var3.d((byte) -113);
              var3.d(121);
              stackIn_6_0 = (byte[]) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3_ref), "bm.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final int b(int param0, int param1) {
        ks var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = (ks) ((Object) this.field_t.a(param0 + -5958, (long)param1));
            if (var3 == null) {
              if (param0 == 5926) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 68;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = var3.g(0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3_ref), "bm.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    public static void e(int param0) {
        field_k = null;
        field_D = null;
        if (param0 > -33) {
            return;
        }
        try {
            field_z = null;
            field_y = (int[][]) null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "bm.H(" + param0 + ')');
        }
    }

    final void c(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (this.field_w == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_u = true;
                if (param0 == 31637) {
                  break L1;
                } else {
                  this.a(-26);
                  break L1;
                }
              }
              L2: {
                if (null == this.field_i) {
                  this.field_i = new at();
                  break L2;
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "bm.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void d(int param0) {
        ks discarded$0 = null;
        ks discarded$1 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tc var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.field_i != null) {
              if (null == this.a(20179)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 1 % ((72 - param0) / 39);
                var2 = this.field_m.e((byte) 120);
                L1: while (true) {
                  if (var2 == null) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      var4 = (int)var2.field_i;
                      if (-1 >= (var4 ^ -1)) {
                        if (var4 < this.field_q.field_i) {
                          if (this.field_q.field_p[var4] != 0) {
                            L3: {
                              if (0 != this.field_C[var4]) {
                                break L3;
                              } else {
                                discarded$0 = this.a(1, var4, 1);
                                break L3;
                              }
                            }
                            L4: {
                              if ((this.field_C[var4] ^ -1) != 0) {
                                break L4;
                              } else {
                                discarded$1 = this.a(1, var4, 2);
                                break L4;
                              }
                            }
                            if (1 != this.field_C[var4]) {
                              break L2;
                            } else {
                              var2.d(-121);
                              break L2;
                            }
                          } else {
                            var2.d(-111);
                            break L2;
                          }
                        } else {
                          var2.d(-111);
                          break L2;
                        }
                      } else {
                        var2.d(-111);
                        break L2;
                      }
                    }
                    var2 = this.field_m.a((byte) 123);
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "bm.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    bm(int param0, bc param1, bc param2, bp param3, vo param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_t = new bg(16);
        this.field_s = 0;
        this.field_m = new at();
        this.field_v = 0L;
        try {
          L0: {
            L1: {
              this.field_r = param0;
              this.field_w = param1;
              if (this.field_w != null) {
                this.field_o = true;
                this.field_i = new at();
                break L1;
              } else {
                this.field_o = false;
                break L1;
              }
            }
            L2: {
              this.field_B = param5;
              this.field_j = param7;
              this.field_g = param6;
              stackIn_6_0 = this;

              if (!param8) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((bm) (this)).field_l = stackIn_7_1 != 0;
              this.field_f = param2;
              this.field_x = param3;
              this.field_A = param4;
              if (null != this.field_f) {
                this.field_n = (ks) ((Object) this.field_A.a(this.field_r, this.field_f, 114));
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var10);

            stackIn_15_1 = new StringBuilder().append("bm.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_16_0);

            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {
            stackIn_23_0 = (RuntimeException) ((Object) stackIn_20_0);

            stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          L7: {
            stackIn_27_0 = (RuntimeException) ((Object) stackIn_24_0);

            stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param4 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          L8: {
            stackIn_31_0 = (RuntimeException) ((Object) stackIn_28_0);

            stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_y = new int[][]{new int[]{0, -10}, new int[]{-20, 0}, new int[]{20, 0}, new int[]{0, 10}};
        field_z = "Connection lost - attempting to reconnect";
        field_k = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
