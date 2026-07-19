/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends of {
    private kh field_w;
    static int field_y;
    private byte[] field_F;
    static String field_r;
    private ng field_G;
    private im field_v;
    static w[] field_D;
    private int field_q;
    private kh field_H;
    private ad field_I;
    private sf field_p;
    private byte[] field_z;
    static tb field_o;
    private dd field_l;
    private int field_n;
    private int field_x;
    static int field_t;
    private vj field_J;
    private boolean field_u;
    private vj field_k;
    private int field_j;
    static eh field_m;
    static int field_s;
    private boolean field_B;
    static ji field_E;
    private long field_A;
    private boolean field_C;

    final ad a(boolean param0) {
        el discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        if (null == this.field_I) {
          L0: {
            if (this.field_p == null) {
              if (!this.field_l.a(param0)) {
                this.field_p = (sf) ((Object) this.field_l.a(true, (byte) 0, true, 255, this.field_x));
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_p.field_z) {
            if (param0) {
              L1: {
                L2: {
                  var7 = this.field_p.g((byte) 70);
                  var6 = var7;
                  var5 = var6;
                  var2 = var5;
                  if (this.field_p instanceof el) {
                    break L2;
                  } else {
                    try {
                      L3: {
                        if (var5 == null) {
                          throw new RuntimeException();
                        } else {
                          this.field_I = new ad(var7, this.field_q, this.field_z);
                          break L3;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var3 = decompiledCaughtException;
                        this.field_l.a(8192);
                        this.field_I = null;
                        if (this.field_l.a(true)) {
                          break L4;
                        } else {
                          this.field_p = (sf) ((Object) this.field_l.a(true, (byte) 0, param0, 255, this.field_x));
                          if (var4 != 0) {
                            break L4;
                          } else {
                            return null;
                          }
                        }
                      }
                      this.field_p = null;
                      return null;
                    }
                    if (this.field_H != null) {
                      discarded$1 = this.field_v.a(this.field_x, this.field_H, var7, (byte) 67);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                try {
                  L5: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_I = new ad(var7, this.field_q, this.field_z);
                      if ((this.field_n ^ -1) == (this.field_I.field_m ^ -1)) {
                        break L5;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    this.field_I = null;
                    if (!this.field_l.a(true)) {
                      break L6;
                    } else {
                      this.field_p = null;
                      if (var4 != 0) {
                        break L6;
                      } else {
                        return null;
                      }
                    }
                  }
                  this.field_p = (sf) ((Object) this.field_l.a(true, (byte) 0, param0, 255, this.field_x));
                  return null;
                }
                break L1;
              }
              L7: {
                if (null == this.field_w) {
                  break L7;
                } else {
                  this.field_F = new byte[this.field_I.field_n];
                  break L7;
                }
              }
              this.field_p = null;
              return this.field_I;
            } else {
              return (ad) null;
            }
          } else {
            return null;
          }
        } else {
          return this.field_I;
        }
    }

    public static void b(boolean param0) {
        field_m = null;
        field_D = null;
        field_E = null;
        field_r = null;
        if (!param0) {
            return;
        }
        field_o = null;
    }

    final void b(int param0) {
        sf discarded$4 = null;
        sf discarded$5 = null;
        bh var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_22_0 = 0;
        var4 = client.field_A ? 1 : 0;
        if (this.field_J != null) {
          if (null != this.a(true)) {
            var2 = this.field_k.c((byte) -113);
            L0: while (true) {
              L1: {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    var3 = (int)var2.field_i;
                    stackOut_6_0 = var3;
                    stackIn_23_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          L5: {
                            if (stackIn_7_0 < 0) {
                              break L5;
                            } else {
                              if (this.field_I.field_n <= var3) {
                                break L5;
                              } else {
                                if (-1 != (this.field_I.field_B[var3] ^ -1)) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var2.b((byte) 105);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                        L6: {
                          if (0 == this.field_F[var3]) {
                            discarded$4 = this.a(1, var3, (byte) -20);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (-1 == this.field_F[var3]) {
                            discarded$5 = this.a(2, var3, (byte) -20);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (this.field_F[var3] != 1) {
                          break L3;
                        } else {
                          var2.b((byte) 117);
                          break L3;
                        }
                      }
                      var2 = this.field_k.d(true);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_22_0 = param0;
                stackIn_23_0 = stackOut_22_0;
                break L1;
              }
              L8: {
                if (stackIn_23_0 == 16322) {
                  break L8;
                } else {
                  this.b(-71);
                  break L8;
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final int a(int param0, int param1) {
        int var4 = 103 % ((param1 - 5) / 58);
        sf dupTemp$0 = (sf) ((Object) this.field_G.a((long)param0, 77));
        sf var5 = dupTemp$0;
        sf var3 = dupTemp$0;
        if (var5 != null) {
            return var5.a(false);
        }
        return 0;
    }

    final void b(byte param0) {
        if (!(null != this.field_w)) {
            return;
        }
        if (param0 != 0) {
            this.field_I = (ad) null;
        }
        this.field_B = true;
        if (!(this.field_J != null)) {
            this.field_J = new vj();
        }
    }

    private final sf a(int param0, int param1, byte param2) {
        sf dupTemp$2 = null;
        el discarded$3 = null;
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        sf var11 = null;
        byte[] var12 = null;
        byte[] var17 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        Object stackIn_64_0 = null;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        Object stackOut_63_0 = null;
        L0: {
          var10 = client.field_A ? 1 : 0;
          dupTemp$2 = (sf) ((Object) this.field_G.a((long)param1, 95));
          var11 = dupTemp$2;
          var4 = dupTemp$2;
          if (var11 == null) {
            break L0;
          } else {
            if ((param0 ^ -1) != -1) {
              break L0;
            } else {
              if (var11.field_D) {
                break L0;
              } else {
                if (var11.field_z) {
                  var11.b((byte) 114);
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
              L3: {
                if (-1 == (param0 ^ -1)) {
                  break L3;
                } else {
                  if (1 == param0) {
                    if (null != this.field_w) {
                      var4 = this.field_v.a(param1, this.field_w, (byte) 61);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    if (param0 != 2) {
                      throw new RuntimeException();
                    } else {
                      if (null == this.field_w) {
                        throw new RuntimeException();
                      } else {
                        if (0 != (this.field_F[param1] ^ -1)) {
                          throw new RuntimeException();
                        } else {
                          if (!this.field_l.b(0)) {
                            var4 = this.field_l.a(false, (byte) 2, true, this.field_x, param1);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              return null;
                            }
                          } else {
                            return null;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L4: {
                if (null == this.field_w) {
                  break L4;
                } else {
                  if (0 != (this.field_F[param1] ^ -1)) {
                    var4 = this.field_v.a(param1, this.field_w, -98);
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              if (!this.field_l.a(true)) {
                var4 = this.field_l.a(true, (byte) 2, true, this.field_x, param1);
                if (var10 == 0) {
                  break L2;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            this.field_G.a((long)param1, -1, (bh) (var4));
            break L1;
          }
        }
        if (!((sf) (var4)).field_z) {
          L5: {
            var17 = ((sf) (var4)).g((byte) 79);
            var12 = var17;
            var5 = var12;
            if (param2 == -20) {
              break L5;
            } else {
              this.field_q = 57;
              break L5;
            }
          }
          if (!(var4 instanceof el)) {
            try {
              L6: {
                L7: {
                  if (var5 == null) {
                    break L7;
                  } else {
                    if (-3 > (var17.length ^ -1)) {
                      ab.field_c.reset();
                      ab.field_c.update(var5, 0, -2 + var17.length);
                      var6_int = (int)ab.field_c.getValue();
                      if ((this.field_I.field_c[param1] ^ -1) != (var6_int ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        L8: {
                          L9: {
                            if (this.field_I.field_l == null) {
                              break L9;
                            } else {
                              if (null != this.field_I.field_l[param1]) {
                                var28 = this.field_I.field_l[param1];
                                var29 = um.a(0, var5, 0, -2 + var17.length);
                                var9 = 0;
                                L10: while (true) {
                                  if (var9 >= 64) {
                                    break L9;
                                  } else {
                                    stackOut_83_0 = var28[var9] ^ -1;
                                    stackOut_83_1 = var29[var9] ^ -1;
                                    stackIn_98_0 = stackOut_83_0;
                                    stackIn_98_1 = stackOut_83_1;
                                    stackIn_84_0 = stackOut_83_0;
                                    stackIn_84_1 = stackOut_83_1;
                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 1;
                                      break L6;
                                    } else {
                                      if (stackIn_84_0 != stackIn_84_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L10;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                this.field_l.field_j = 0;
                                this.field_l.field_o = 0;
                                break L8;
                              }
                            }
                          }
                          this.field_l.field_j = 0;
                          this.field_l.field_o = 0;
                          break L8;
                        }
                        decompiledRegionSelector0 = 0;
                        break L6;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              this.field_l.a(8192);
              ((sf) (var4)).b((byte) 117);
              if (((sf) (var4)).field_D) {
                if (!this.field_l.a(true)) {
                  var4 = this.field_l.a(true, (byte) 2, true, this.field_x, param1);
                  this.field_G.a((long)param1, -1, (bh) (var4));
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            L11: {
              L12: {
                if (decompiledRegionSelector0 == 0) {
                  var5[-2 + var17.length] = (byte)(this.field_I.field_y[param1] >>> 967493416);
                  var5[-1 + var17.length] = (byte)this.field_I.field_y[param1];
                  if (null != this.field_w) {
                    discarded$3 = this.field_v.a(param1, this.field_w, var17, (byte) -68);
                    stackOut_97_0 = this.field_F[param1] ^ -1;
                    stackOut_97_1 = -2;
                    stackIn_98_0 = stackOut_97_0;
                    stackIn_98_1 = stackOut_97_1;
                    break L12;
                  } else {
                    break L11;
                  }
                } else {
                  break L12;
                }
              }
              if (stackIn_98_0 == stackIn_98_1) {
                break L11;
              } else {
                this.field_F[param1] = (byte) 1;
                break L11;
              }
            }
            L13: {
              if (!((sf) (var4)).field_D) {
                ((sf) (var4)).b((byte) 117);
                break L13;
              } else {
                break L13;
              }
            }
            return (sf) (var4);
          } else {
            try {
              L14: {
                L15: {
                  if (var5 == null) {
                    break L15;
                  } else {
                    if (-3 > (var17.length ^ -1)) {
                      ab.field_c.reset();
                      ab.field_c.update(var5, 0, -2 + var17.length);
                      var6_int = (int)ab.field_c.getValue();
                      if ((this.field_I.field_c[param1] ^ -1) != (var6_int ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        L16: {
                          L17: {
                            if (this.field_I.field_l == null) {
                              break L17;
                            } else {
                              if (null != this.field_I.field_l[param1]) {
                                var27 = this.field_I.field_l[param1];
                                var26 = um.a(0, var5, 0, var17.length - 2);
                                var9 = 0;
                                L18: while (true) {
                                  if (64 <= var9) {
                                    break L17;
                                  } else {
                                    stackOut_50_0 = var26[var9] ^ -1;
                                    stackOut_50_1 = var27[var9] ^ -1;
                                    stackIn_55_0 = stackOut_50_0;
                                    stackIn_55_1 = stackOut_50_1;
                                    stackIn_51_0 = stackOut_50_0;
                                    stackIn_51_1 = stackOut_50_1;
                                    if (var10 != 0) {
                                      break L16;
                                    } else {
                                      if (stackIn_51_0 == stackIn_51_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L18;
                                        } else {
                                          break L17;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L17;
                              }
                            }
                          }
                          stackOut_54_0 = (var5[var17.length + -2] & 255) << 1262224936;
                          stackOut_54_1 = -(var5[var17.length + -1] & 255);
                          stackIn_55_0 = stackOut_54_0;
                          stackIn_55_1 = stackOut_54_1;
                          break L16;
                        }
                        var7 = stackIn_55_0 - stackIn_55_1;
                        if ((this.field_I.field_y[param1] & 65535) == var7) {
                          L19: {
                            if (this.field_F[param1] != 1) {
                              L20: {
                                if (0 != this.field_F[param1]) {
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              this.field_F[param1] = (byte) 1;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          L21: {
                            if (((sf) (var4)).field_D) {
                              break L21;
                            } else {
                              ((sf) (var4)).b((byte) 115);
                              break L21;
                            }
                          }
                          stackOut_63_0 = var4;
                          stackIn_64_0 = stackOut_63_0;
                          break L14;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Exception) (Object) decompiledCaughtException;
              this.field_F[param1] = (byte)-1;
              ((sf) (var4)).b((byte) 119);
              if (((sf) (var4)).field_D) {
                L22: {
                  if (!this.field_l.a(true)) {
                    var4 = this.field_l.a(true, (byte) 2, true, this.field_x, param1);
                    this.field_G.a((long)param1, param2 ^ 19, (bh) (var4));
                    break L22;
                  } else {
                    break L22;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            return (sf) ((Object) stackIn_64_0);
          }
        } else {
          return null;
        }
    }

    final static int b(int param0, int param1) {
        if (param0 != 32085) {
            le.b(false);
        }
        return 500 * ((-1 + param1) * param1);
    }

    final static void a(byte param0, int param1) {
        dk.field_i = param1 * 100 / 150;
        dk.field_c = (param1 << -367606192) / 150;
        dk.field_g = param1 * 400 / 150;
        int var2 = 101 % ((8 - param0) / 52);
    }

    final void c(boolean param0) {
        sf discarded$6 = null;
        sf discarded$7 = null;
        sf discarded$8 = null;
        sf discarded$9 = null;
        sf discarded$10 = null;
        sf discarded$11 = null;
        sf var2 = null;
        int var2_int = 0;
        bh var3 = null;
        int var4 = 0;
        int var5 = 0;
        bh var6 = null;
        bh var7 = null;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        byte stackIn_41_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        int stackOut_126_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_40_0 = 0;
        byte stackOut_40_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_64_0 = 0;
        L0: {
          var5 = client.field_A ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            this.c(false);
            break L0;
          }
        }
        L1: {
          if (null == this.field_J) {
            break L1;
          } else {
            if (null == this.a(param0)) {
              return;
            } else {
              L2: {
                if (!this.field_u) {
                  break L2;
                } else {
                  var2_int = 1;
                  var3 = this.field_J.c((byte) 54);
                  L3: while (true) {
                    L4: {
                      L5: {
                        L6: {
                          if (var3 == null) {
                            break L6;
                          } else {
                            var4 = (int)var3.field_i;
                            stackOut_9_0 = -1;
                            stackOut_9_1 = this.field_F[var4] ^ -1;
                            stackIn_19_0 = stackOut_9_0;
                            stackIn_19_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (var5 != 0) {
                              L7: while (true) {
                                if (stackIn_19_0 >= stackIn_19_1) {
                                  break L5;
                                } else {
                                  stackOut_20_0 = 0;
                                  stackIn_32_0 = stackOut_20_0;
                                  stackIn_21_0 = stackOut_20_0;
                                  if (var5 != 0) {
                                    break L4;
                                  } else {
                                    L8: {
                                      L9: {
                                        if (stackIn_21_0 == this.field_I.field_B[this.field_j]) {
                                          this.field_j = this.field_j + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        if (this.field_v.field_b < 250) {
                                          break L10;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L5;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      L11: {
                                        if ((this.field_F[this.field_j] ^ -1) != -1) {
                                          break L11;
                                        } else {
                                          discarded$6 = this.a(1, this.field_j, (byte) -20);
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (0 != this.field_F[this.field_j]) {
                                          break L12;
                                        } else {
                                          var6 = new bh();
                                          var6.field_i = (long)this.field_j;
                                          this.field_J.a(var6, 2777);
                                          var2_int = 0;
                                          break L12;
                                        }
                                      }
                                      this.field_j = this.field_j + 1;
                                      if (var5 == 0) {
                                        break L8;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    stackOut_18_0 = this.field_j;
                                    stackOut_18_1 = this.field_I.field_B.length;
                                    stackIn_19_0 = stackOut_18_0;
                                    stackIn_19_1 = stackOut_18_1;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              L13: {
                                if (stackIn_10_0 == stackIn_10_1) {
                                  discarded$7 = this.a(1, var4, (byte) -20);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                L15: {
                                  if (this.field_F[var4] != 0) {
                                    break L15;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                var3.b((byte) 121);
                                break L14;
                              }
                              var3 = this.field_J.d(true);
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L16: while (true) {
                          stackOut_130_0 = this.field_j;
                          stackOut_130_1 = this.field_I.field_B.length;
                          stackIn_128_0 = stackOut_130_0;
                          stackIn_128_1 = stackOut_130_1;
                          if (stackIn_128_0 >= stackIn_128_1) {
                            break L5;
                          } else {
                            stackOut_126_0 = 0;
                            stackIn_32_0 = stackOut_126_0;
                            stackIn_127_0 = stackOut_126_0;
                            if (var5 != 0) {
                              break L4;
                            } else {
                              stackOut_127_0 = stackIn_127_0;
                              stackIn_124_0 = stackOut_127_0;
                              L17: {
                                if (stackIn_124_0 == this.field_I.field_B[this.field_j]) {
                                  this.field_j = this.field_j + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              L18: {
                                if (this.field_v.field_b < 250) {
                                  break L18;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              L19: {
                                if ((this.field_F[this.field_j] ^ -1) != -1) {
                                  break L19;
                                } else {
                                  discarded$8 = this.a(1, this.field_j, (byte) -20);
                                  break L19;
                                }
                              }
                              L20: {
                                if (0 != this.field_F[this.field_j]) {
                                  break L20;
                                } else {
                                  var6 = new bh();
                                  var6.field_i = (long)this.field_j;
                                  this.field_J.a(var6, 2777);
                                  var2_int = 0;
                                  break L20;
                                }
                              }
                              this.field_j = this.field_j + 1;
                              if (var5 == 0) {
                                continue L16;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      stackOut_31_0 = var2_int;
                      stackIn_32_0 = stackOut_31_0;
                      break L4;
                    }
                    L21: {
                      if (stackIn_32_0 == 0) {
                        break L21;
                      } else {
                        this.field_j = 0;
                        this.field_u = false;
                        break L21;
                      }
                    }
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L22: {
                if (this.field_B) {
                  break L22;
                } else {
                  this.field_J = null;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L22;
                  }
                }
              }
              var2_int = 1;
              var3 = this.field_J.c((byte) 77);
              L23: while (true) {
                L24: {
                  L25: {
                    L26: {
                      if (var3 == null) {
                        break L26;
                      } else {
                        var4 = (int)var3.field_i;
                        stackOut_40_0 = 1;
                        stackOut_40_1 = this.field_F[var4];
                        stackIn_50_0 = stackOut_40_0;
                        stackIn_50_1 = stackOut_40_1;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        if (var5 != 0) {
                          L27: while (true) {
                            if (stackIn_50_0 <= stackIn_50_1) {
                              break L25;
                            } else {
                              stackOut_51_0 = this.field_I.field_B[this.field_j];
                              stackIn_65_0 = stackOut_51_0;
                              stackIn_52_0 = stackOut_51_0;
                              if (var5 != 0) {
                                break L24;
                              } else {
                                L28: {
                                  L29: {
                                    if (stackIn_52_0 == 0) {
                                      this.field_j = this.field_j + 1;
                                      if (var5 == 0) {
                                        break L28;
                                      } else {
                                        break L29;
                                      }
                                    } else {
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    if (this.field_l.b(0)) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L25;
                                      } else {
                                        break L30;
                                      }
                                    } else {
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    if (this.field_F[this.field_j] != 1) {
                                      discarded$9 = this.a(2, this.field_j, (byte) -20);
                                      break L31;
                                    } else {
                                      break L31;
                                    }
                                  }
                                  L32: {
                                    if (1 == this.field_F[this.field_j]) {
                                      break L32;
                                    } else {
                                      var7 = new bh();
                                      var7.field_i = (long)this.field_j;
                                      this.field_J.a(var7, 2777);
                                      var2_int = 0;
                                      break L32;
                                    }
                                  }
                                  this.field_j = this.field_j + 1;
                                  if (var5 == 0) {
                                    break L28;
                                  } else {
                                    break L25;
                                  }
                                }
                                stackOut_49_0 = this.field_j ^ -1;
                                stackOut_49_1 = this.field_I.field_B.length ^ -1;
                                stackIn_50_0 = stackOut_49_0;
                                stackIn_50_1 = stackOut_49_1;
                                continue L27;
                              }
                            }
                          }
                        } else {
                          L33: {
                            if (stackIn_41_0 == stackIn_41_1) {
                              break L33;
                            } else {
                              discarded$10 = this.a(2, var4, (byte) -20);
                              break L33;
                            }
                          }
                          L34: {
                            L35: {
                              if (-2 != (this.field_F[var4] ^ -1)) {
                                break L35;
                              } else {
                                var3.b((byte) 102);
                                if (var5 == 0) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            var2_int = 0;
                            break L34;
                          }
                          var3 = this.field_J.d(true);
                          if (var5 == 0) {
                            continue L23;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    L36: while (true) {
                      stackOut_108_0 = this.field_j ^ -1;
                      stackOut_108_1 = this.field_I.field_B.length ^ -1;
                      stackIn_106_0 = stackOut_108_0;
                      stackIn_106_1 = stackOut_108_1;
                      if (stackIn_106_0 <= stackIn_106_1) {
                        break L25;
                      } else {
                        stackOut_104_0 = this.field_I.field_B[this.field_j];
                        stackIn_65_0 = stackOut_104_0;
                        stackIn_105_0 = stackOut_104_0;
                        if (var5 != 0) {
                          break L24;
                        } else {
                          stackOut_105_0 = stackIn_105_0;
                          stackIn_102_0 = stackOut_105_0;
                          L37: {
                            if (stackIn_102_0 == 0) {
                              this.field_j = this.field_j + 1;
                              if (var5 == 0) {
                                continue L36;
                              } else {
                                break L37;
                              }
                            } else {
                              break L37;
                            }
                          }
                          L38: {
                            if (this.field_l.b(0)) {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L25;
                              } else {
                                break L38;
                              }
                            } else {
                              break L38;
                            }
                          }
                          L39: {
                            if (this.field_F[this.field_j] != 1) {
                              discarded$11 = this.a(2, this.field_j, (byte) -20);
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                          L40: {
                            if (1 == this.field_F[this.field_j]) {
                              break L40;
                            } else {
                              var7 = new bh();
                              var7.field_i = (long)this.field_j;
                              this.field_J.a(var7, 2777);
                              var2_int = 0;
                              break L40;
                            }
                          }
                          this.field_j = this.field_j + 1;
                          if (var5 == 0) {
                            continue L36;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                  }
                  stackOut_64_0 = var2_int;
                  stackIn_65_0 = stackOut_64_0;
                  break L24;
                }
                if (stackIn_65_0 != 0) {
                  this.field_j = 0;
                  this.field_B = false;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        L41: {
          if (!this.field_C) {
            break L41;
          } else {
            L42: {
              if ((ik.a(4) ^ -1L) > (this.field_A ^ -1L)) {
                break L42;
              } else {
                var2 = (sf) ((Object) this.field_G.a((byte) 126));
                L43: while (true) {
                  L44: {
                    if (var2 == null) {
                      break L44;
                    } else {
                      if (var5 != 0) {
                        break L42;
                      } else {
                        L45: {
                          if (var2.field_z) {
                            break L45;
                          } else {
                            L46: {
                              if (var2.field_A) {
                                break L46;
                              } else {
                                var2.field_A = true;
                                if (var5 == 0) {
                                  break L45;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            if (!var2.field_D) {
                              throw new RuntimeException();
                            } else {
                              var2.b((byte) 101);
                              break L45;
                            }
                          }
                        }
                        var2 = (sf) ((Object) this.field_G.b((byte) 107));
                        if (var5 == 0) {
                          continue L43;
                        } else {
                          break L44;
                        }
                      }
                    }
                  }
                  this.field_A = ik.a(4) + 1000L;
                  break L42;
                }
              }
            }
            break L41;
          }
        }
    }

    final byte[] a(int param0, byte param1) {
        sf var3 = this.a(0, param0, (byte) -20);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.g((byte) 126);
        var3.b((byte) 107);
        if (param1 != 91) {
            return (byte[]) null;
        }
        return var4;
    }

    le(int param0, kh param1, kh param2, dd param3, im param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_G = new ng(16);
        this.field_j = 0;
        this.field_k = new vj();
        this.field_A = 0L;
        try {
          L0: {
            L1: {
              L2: {
                this.field_w = param1;
                this.field_x = param0;
                if (null != this.field_w) {
                  break L2;
                } else {
                  this.field_u = false;
                  if (!client.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_u = true;
              this.field_J = new vj();
              break L1;
            }
            L3: {
              this.field_q = param5;
              this.field_l = param3;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((le) (this)).field_C = stackIn_7_1 != 0;
              this.field_z = param6;
              this.field_H = param2;
              this.field_n = param7;
              this.field_v = param4;
              if (null == this.field_H) {
                break L4;
              } else {
                this.field_p = (sf) ((Object) this.field_v.a(this.field_x, this.field_H, -36));
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var10);
            stackOut_10_1 = new StringBuilder().append("le.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_r = "No highscores";
        field_o = new tb();
    }
}
