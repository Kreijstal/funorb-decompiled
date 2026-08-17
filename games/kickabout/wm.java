/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends ow {
    private qh field_q;
    static ut[] field_m;
    static int field_E;
    private int field_D;
    private kc field_v;
    private bi field_l;
    static String field_p;
    private int field_h;
    static ae field_u;
    private byte[] field_x;
    private eb field_w;
    private byte[] field_r;
    static int field_s;
    static double field_C;
    private qh field_k;
    private vv field_B;
    private int field_j;
    static String[] field_o;
    private kl field_z;
    private tf field_t;
    private boolean field_g;
    private boolean field_n;
    private int field_i;
    private tf field_F;
    private long field_y;
    private boolean field_A;

    final int a(int param0, int param1) {
        vv var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = (vv) ((Object) this.field_v.a(true, (long)param1));
            if (var3 == null) {
              if (param0 == 6999) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.b(-39, 41);
                return 0;
              }
            } else {
              stackIn_2_0 = var3.a(0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3_ref), "wm.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void d(int param0) {
        vv discarded$0 = null;
        vv discarded$1 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gn var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == 18137) {
              if (null != this.field_t) {
                if (this.a(param0 + -42991) != null) {
                  var2 = this.field_F.g(24009);
                  L1: while (true) {
                    if (var2 == null) {
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L2: {
                        var3 = (int)var2.field_a;
                        if ((var3 ^ -1) <= -1) {
                          if (this.field_z.field_d > var3) {
                            if (this.field_z.field_i[var3] != 0) {
                              L3: {
                                if (this.field_r[var3] == 0) {
                                  discarded$0 = this.a(1, var3, (byte) -30);
                                  break L3;
                                } else {
                                  break L3;
                                }
                              }
                              L4: {
                                if (-1 != this.field_r[var3]) {
                                  break L4;
                                } else {
                                  discarded$1 = this.a(2, var3, (byte) -30);
                                  break L4;
                                }
                              }
                              if (-2 == (this.field_r[var3] ^ -1)) {
                                var2.c((byte) -109);
                                break L2;
                              } else {
                                break L2;
                              }
                            } else {
                              var2.c((byte) -109);
                              break L2;
                            }
                          } else {
                            var2.c((byte) -109);
                            break L2;
                          }
                        } else {
                          var2.c((byte) -109);
                          break L2;
                        }
                      }
                      var2 = this.field_F.c(33);
                      continue L1;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "wm.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static boolean c(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vg.field_Wb) {
              var1_int = -4 / ((-84 - param0) / 34);
              if (0 != ov.field_b) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "wm.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static void c(int param0) {
        try {
            if (param0 != 1) {
                field_u = (ae) null;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "wm.J(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (this.field_k == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_g = true;
                if (this.field_t == null) {
                  this.field_t = new tf();
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 >= 28) {
                  break L2;
                } else {
                  this.field_n = true;
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
          throw nb.a((Throwable) ((Object) var2), "wm.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final kl a(int param0) {
        kl stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_44_0 = null;
        kl stackIn_52_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (this.field_z != null) {
              stackIn_5_0 = this.field_z;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == this.field_B) {
                  if (!this.field_l.a(25533)) {
                    this.field_B = (vv) ((Object) this.field_l.a(255, this.field_h, (byte) 0, (byte) 89, true));
                    break L1;
                  } else {
                    stackIn_11_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              if (!this.field_B.field_p) {
                L2: {
                  var7 = this.field_B.b(12802);
                  var6 = var7;
                  var5 = var6;
                  var2 = var5;
                  if (this.field_B instanceof hi) {
                    try {
                      L3: {
                        if (var5 != null) {
                          this.field_z = new kl(var7, this.field_D, this.field_x);
                          if (this.field_z.field_p == this.field_j) {
                            break L3;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var3 = decompiledCaughtException;
                        this.field_z = null;
                        if (this.field_l.a(param0 + 50387)) {
                          this.field_B = null;
                          break L4;
                        } else {
                          this.field_B = (vv) ((Object) this.field_l.a(255, this.field_h, (byte) 0, (byte) 89, true));
                          break L4;
                        }
                      }
                      stackIn_44_0 = null;
                      return (kl) ((Object) stackIn_44_0);
                    }
                    break L2;
                  } else {
                    try {
                      L5: {
                        if (var5 != null) {
                          this.field_z = new kl(var7, this.field_D, this.field_x);
                          break L5;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L6: {
                        var3 = decompiledCaughtException;
                        this.field_l.c(-65);
                        this.field_z = null;
                        if (!this.field_l.a(param0 + 50387)) {
                          this.field_B = (vv) ((Object) this.field_l.a(255, this.field_h, (byte) 0, (byte) 89, true));
                          break L6;
                        } else {
                          this.field_B = null;
                          break L6;
                        }
                      }
                      stackIn_27_0 = null;
                      return (kl) ((Object) stackIn_27_0);
                    }
                    if (this.field_q != null) {
                      this.field_w.a(this.field_h, this.field_q, var7, (byte) 11);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L7: {
                  if (param0 == -24854) {
                    break L7;
                  } else {
                    this.b(113);
                    break L7;
                  }
                }
                L8: {
                  if (null != this.field_k) {
                    this.field_r = new byte[this.field_z.field_d];
                    break L8;
                  } else {
                    break L8;
                  }
                }
                this.field_B = null;
                stackIn_52_0 = this.field_z;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_15_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "wm.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (kl) ((Object) stackIn_11_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (kl) ((Object) stackIn_15_0);
            } else {
              return stackIn_52_0;
            }
          }
        }
    }

    final void b(int param0) {
        vv discarded$0 = null;
        vv discarded$1 = null;
        vv discarded$2 = null;
        vv discarded$3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        gn var3 = null;
        vv var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        gn var6 = null;
        gn var7 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (this.field_t != null) {
                      if (null != this.a(-24854)) {
                        if (!this.field_n) {
                          if (!this.field_g) {
                            this.field_t = null;
                            break L4;
                          } else {
                            var2_int = 1;
                            var3 = this.field_t.g(24009);
                            L5: while (true) {
                              if (var3 == null) {
                                L6: while (true) {
                                  L7: {
                                    if (this.field_i >= this.field_z.field_i.length) {
                                      break L7;
                                    } else {
                                      if (-1 != (this.field_z.field_i[this.field_i] ^ -1)) {
                                        if (this.field_l.d(10770)) {
                                          var2_int = 0;
                                          break L7;
                                        } else {
                                          L8: {
                                            if ((this.field_r[this.field_i] ^ -1) == -2) {
                                              break L8;
                                            } else {
                                              discarded$0 = this.a(2, this.field_i, (byte) -30);
                                              break L8;
                                            }
                                          }
                                          L9: {
                                            if (this.field_r[this.field_i] != 1) {
                                              var7 = new gn();
                                              var7.field_a = (long)this.field_i;
                                              var2_int = 0;
                                              this.field_t.a(var7, 3);
                                              break L9;
                                            } else {
                                              break L9;
                                            }
                                          }
                                          this.field_i = this.field_i + 1;
                                          continue L6;
                                        }
                                      } else {
                                        this.field_i = this.field_i + 1;
                                        continue L6;
                                      }
                                    }
                                  }
                                  if (var2_int != 0) {
                                    this.field_g = false;
                                    this.field_i = 0;
                                    break L4;
                                  } else {
                                    var2_int = 15 % ((-84 - param0) / 37);
                                    if (!this.field_A) {
                                      break L2;
                                    } else {
                                      if ((nj.a(-58) ^ -1L) <= (this.field_y ^ -1L)) {
                                        var3_ref = (vv) ((Object) this.field_v.b(0));
                                        L10: while (true) {
                                          if (var3_ref == null) {
                                            break L3;
                                          } else {
                                            L11: {
                                              if (var3_ref.field_p) {
                                                break L11;
                                              } else {
                                                if (!var3_ref.field_n) {
                                                  var3_ref.field_n = true;
                                                  break L11;
                                                } else {
                                                  if (!var3_ref.field_q) {
                                                    throw new RuntimeException();
                                                  } else {
                                                    var3_ref.c((byte) -109);
                                                    break L11;
                                                  }
                                                }
                                              }
                                            }
                                            var3_ref = (vv) ((Object) this.field_v.a(-1));
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        break L1;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L12: {
                                  var4 = (int)var3.field_a;
                                  if (-2 == (this.field_r[var4] ^ -1)) {
                                    break L12;
                                  } else {
                                    discarded$1 = this.a(2, var4, (byte) -30);
                                    break L12;
                                  }
                                }
                                L13: {
                                  if (1 != this.field_r[var4]) {
                                    var2_int = 0;
                                    break L13;
                                  } else {
                                    var3.c((byte) -109);
                                    break L13;
                                  }
                                }
                                var3 = this.field_t.c(33);
                                continue L5;
                              }
                            }
                          }
                        } else {
                          var2_int = 1;
                          var3 = this.field_t.g(24009);
                          L14: while (true) {
                            if (var3 == null) {
                              L15: while (true) {
                                L16: {
                                  if (this.field_z.field_i.length <= this.field_i) {
                                    break L16;
                                  } else {
                                    if (this.field_z.field_i[this.field_i] != 0) {
                                      if (this.field_w.field_e >= 250) {
                                        var2_int = 0;
                                        break L16;
                                      } else {
                                        L17: {
                                          if (0 != this.field_r[this.field_i]) {
                                            break L17;
                                          } else {
                                            discarded$2 = this.a(1, this.field_i, (byte) -30);
                                            break L17;
                                          }
                                        }
                                        L18: {
                                          if (0 == this.field_r[this.field_i]) {
                                            var6 = new gn();
                                            var6.field_a = (long)this.field_i;
                                            var2_int = 0;
                                            this.field_t.a(var6, 3);
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        this.field_i = this.field_i + 1;
                                        continue L15;
                                      }
                                    } else {
                                      this.field_i = this.field_i + 1;
                                      continue L15;
                                    }
                                  }
                                }
                                if (var2_int == 0) {
                                  break L4;
                                } else {
                                  this.field_i = 0;
                                  this.field_n = false;
                                  break L4;
                                }
                              }
                            } else {
                              L19: {
                                var4 = (int)var3.field_a;
                                if (this.field_r[var4] != 0) {
                                  break L19;
                                } else {
                                  discarded$3 = this.a(1, var4, (byte) -30);
                                  break L19;
                                }
                              }
                              L20: {
                                if (-1 == (this.field_r[var4] ^ -1)) {
                                  var2_int = 0;
                                  break L20;
                                } else {
                                  var3.c((byte) -109);
                                  break L20;
                                }
                              }
                              var3 = this.field_t.c(33);
                              continue L14;
                            }
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var2_int = 15 % ((-84 - param0) / 37);
                  if (!this.field_A) {
                    break L2;
                  } else {
                    if ((nj.a(-58) ^ -1L) <= (this.field_y ^ -1L)) {
                      var3_ref = (vv) ((Object) this.field_v.b(0));
                      L21: while (true) {
                        if (var3_ref == null) {
                          break L3;
                        } else {
                          L22: {
                            if (var3_ref.field_p) {
                              break L22;
                            } else {
                              if (!var3_ref.field_n) {
                                var3_ref.field_n = true;
                                break L22;
                              } else {
                                if (!var3_ref.field_q) {
                                  throw new RuntimeException();
                                } else {
                                  var3_ref.c((byte) -109);
                                  break L22;
                                }
                              }
                            }
                          }
                          var3_ref = (vv) ((Object) this.field_v.a(-1));
                          continue L21;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                this.field_y = 1000L + nj.a(116);
                break L2;
              }
              break L1;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "wm.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_p = null;
        if (param0 > -114) {
            return;
        }
        try {
            field_m = null;
            field_u = null;
            field_o = null;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "wm.M(" + param0 + ')');
        }
    }

    private final vv a(int param0, int param1, byte param2) {
        Object stackIn_34_0 = null;
        Object stackIn_40_0 = null;
        vv stackIn_43_0 = null;
        Object stackIn_73_0 = null;
        Object stackIn_81_0 = null;
        Object stackIn_107_0 = null;
        Object stackIn_117_0 = null;
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
        vv var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var12 = (vv) ((Object) this.field_v.a(true, (long)param1));
              var4 = var12;
              if (var12 == null) {
                break L1;
              } else {
                if (param0 != 0) {
                  break L1;
                } else {
                  if (var12.field_q) {
                    break L1;
                  } else {
                    if (!var12.field_p) {
                      break L1;
                    } else {
                      var12.c((byte) -109);
                      var4 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (var4 == null) {
                L3: {
                  if (param0 == 0) {
                    L4: {
                      if (null == this.field_k) {
                        break L4;
                      } else {
                        if (-1 != this.field_r[param1]) {
                          var4 = this.field_w.a(-913, this.field_k, param1);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (!this.field_l.a(25533)) {
                      var4 = this.field_l.a(this.field_h, param1, (byte) 2, (byte) 89, true);
                      break L3;
                    } else {
                      stackIn_34_0 = null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    if (param0 == 1) {
                      if (null != this.field_k) {
                        var4 = this.field_w.a(param2 + 8977, param1, this.field_k);
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      if ((param0 ^ -1) != -3) {
                        throw new RuntimeException();
                      } else {
                        if (this.field_k == null) {
                          throw new RuntimeException();
                        } else {
                          if (0 != (this.field_r[param1] ^ -1)) {
                            throw new RuntimeException();
                          } else {
                            if (!this.field_l.d(10770)) {
                              var4 = this.field_l.a(this.field_h, param1, (byte) 2, (byte) 89, false);
                              break L3;
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                this.field_v.a((gn) (var4), -73, (long)param1);
                break L2;
              } else {
                break L2;
              }
            }
            if (!((vv) (var4)).field_p) {
              if (param2 == -30) {
                var18 = ((vv) (var4)).b(12802);
                var13 = var18;
                var5 = var13;
                if (!(var4 instanceof hi)) {
                  try {
                    L5: {
                      L6: {
                        if (var5 == null) {
                          break L6;
                        } else {
                          if (var18.length <= 2) {
                            break L6;
                          } else {
                            dg.field_b.reset();
                            dg.field_b.update(var5, 0, var18.length - 2);
                            var6_int = (int)dg.field_b.getValue();
                            if (var6_int == this.field_z.field_c[param1]) {
                              L7: {
                                if (null == this.field_z.field_k) {
                                  break L7;
                                } else {
                                  if (null == this.field_z.field_k[param1]) {
                                    break L7;
                                  } else {
                                    var29 = this.field_z.field_k[param1];
                                    var30 = jj.a(-2 + var18.length, var18, (byte) 80, 0);
                                    var11 = 0;
                                    var9 = var11;
                                    L8: while (true) {
                                      if ((var11 ^ -1) <= -65) {
                                        break L7;
                                      } else {
                                        if ((var29[var11] ^ -1) != (var30[var11] ^ -1)) {
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
                              this.field_l.field_o = 0;
                              this.field_l.field_l = 0;
                              break L5;
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
                    var6 = (RuntimeException) (Object) decompiledCaughtException;
                    this.field_l.c(5);
                    ((vv) (var4)).c((byte) -109);
                    if (((vv) (var4)).field_q) {
                      if (!this.field_l.a(25533)) {
                        var4 = this.field_l.a(this.field_h, param1, (byte) 2, (byte) 89, true);
                        this.field_v.a((gn) (var4), param2 + 128, (long)param1);
                        stackIn_107_0 = null;
                        return (vv) ((Object) stackIn_107_0);
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  }
                  L9: {
                    var5[-2 + var18.length] = (byte)(this.field_z.field_f[param1] >>> -1666623448);
                    var5[-1 + var18.length] = (byte)this.field_z.field_f[param1];
                    if (null == this.field_k) {
                      break L9;
                    } else {
                      this.field_w.a(param1, this.field_k, var18, (byte) 66);
                      if ((this.field_r[param1] ^ -1) != -2) {
                        this.field_r[param1] = (byte) 1;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (!((vv) (var4)).field_q) {
                      ((vv) (var4)).c((byte) -109);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  stackIn_117_0 = var4;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  try {
                    L11: {
                      L12: {
                        if (var5 == null) {
                          break L12;
                        } else {
                          if (-3 > (var18.length ^ -1)) {
                            dg.field_b.reset();
                            dg.field_b.update(var5, 0, -2 + var18.length);
                            var6_int = (int)dg.field_b.getValue();
                            if (this.field_z.field_c[param1] == var6_int) {
                              L13: {
                                if (null == this.field_z.field_k) {
                                  break L13;
                                } else {
                                  if (this.field_z.field_k[param1] == null) {
                                    break L13;
                                  } else {
                                    var28 = this.field_z.field_k[param1];
                                    var27 = jj.a(var18.length - 2, var18, (byte) 69, 0);
                                    var9 = 0;
                                    L14: while (true) {
                                      if (-65 >= (var9 ^ -1)) {
                                        break L13;
                                      } else {
                                        if (var27[var9] != var28[var9]) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          continue L14;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var7 = (var5[var18.length - 1] & 255) + ((var5[var18.length - 2] & 255) << 922689160);
                              if (var7 == (this.field_z.field_f[param1] & 65535)) {
                                L15: {
                                  if (-2 != (this.field_r[param1] ^ -1)) {
                                    L16: {
                                      if (this.field_r[param1] == 0) {
                                        break L16;
                                      } else {
                                        break L16;
                                      }
                                    }
                                    this.field_r[param1] = (byte) 1;
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                L17: {
                                  if (((vv) (var4)).field_q) {
                                    break L17;
                                  } else {
                                    ((vv) (var4)).c((byte) -109);
                                    break L17;
                                  }
                                }
                                stackIn_73_0 = var4;
                                break L11;
                              } else {
                                throw new RuntimeException();
                              }
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L18: {
                      var6_ref = (Exception) (Object) decompiledCaughtException;
                      this.field_r[param1] = (byte)-1;
                      ((vv) (var4)).c((byte) -109);
                      if (((vv) (var4)).field_q) {
                        if (!this.field_l.a(25533)) {
                          var4 = this.field_l.a(this.field_h, param1, (byte) 2, (byte) 89, true);
                          this.field_v.a((gn) (var4), -50, (long)param1);
                          break L18;
                        } else {
                          return null;
                        }
                      } else {
                        break L18;
                      }
                    }
                    stackIn_81_0 = null;
                    return (vv) ((Object) stackIn_81_0);
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                stackIn_43_0 = (vv) null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_40_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw nb.a((Throwable) (var4), "wm.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vv) ((Object) stackIn_34_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (vv) ((Object) stackIn_40_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_43_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (vv) ((Object) stackIn_117_0);
              } else {
                return (vv) ((Object) stackIn_73_0);
              }
            }
          }
        }
    }

    final static ut a(byte param0, ut param1, int param2) {
        ut var3 = null;
        RuntimeException var3_ref = null;
        ut stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new ut(param2, param1.field_v);
              iw.a(-59, var3);
              param1.c(0, 0);
              pt.a(on.field_g, -22914, on.field_g >> -472384991, on.field_f, 0);
              if (param0 < -20) {
                break L1;
              } else {
                wm.c((byte) 52);
                break L1;
              }
            }
            param1.c(-param1.field_o + on.field_g, 0);
            ta.e(122);
            ta.e(125);
            stackIn_3_0 = (ut) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("wm.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final byte[] b(int param0, int param1) {
        vv var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.a(0, param0, (byte) -30);
            if (var3 != null) {
              L1: {
                var4 = var3.b(12802);
                if (param1 == 4) {
                  break L1;
                } else {
                  this.a(21);
                  break L1;
                }
              }
              var3.c((byte) -109);
              stackIn_7_0 = (byte[]) (var4);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3_ref), "wm.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    wm(int param0, qh param1, qh param2, bi param3, eb param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_v = new kc(16);
        this.field_i = 0;
        this.field_F = new tf();
        this.field_y = 0L;
        try {
          L0: {
            L1: {
              this.field_h = param0;
              this.field_k = param1;
              if (this.field_k == null) {
                this.field_n = false;
                break L1;
              } else {
                this.field_n = true;
                this.field_t = new tf();
                break L1;
              }
            }
            L2: {
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
              ((wm) (this)).field_A = stackIn_7_1 != 0;
              this.field_j = param7;
              this.field_D = param5;
              this.field_w = param4;
              this.field_x = param6;
              this.field_l = param3;
              this.field_q = param2;
              if (null != this.field_q) {
                this.field_B = (vv) ((Object) this.field_w.a(-913, this.field_q, this.field_h));
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

            stackIn_15_1 = new StringBuilder().append("wm.<init>(").append(param0).append(',');

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
          throw nb.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_p = "Rating";
        field_s = 1;
    }
}
