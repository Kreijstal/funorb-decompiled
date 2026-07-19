/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends tk {
    private pc field_o;
    static String field_E;
    private int field_u;
    private byte[] field_B;
    static al field_n;
    private byte[] field_p;
    private rl field_y;
    private vh field_i;
    private int field_x;
    private ae field_v;
    private ae field_s;
    static int[] field_z;
    static int[][] field_l;
    static String field_F;
    private int field_D;
    static int[] field_A;
    private we field_h;
    private jf field_q;
    private boolean field_m;
    private mn field_r;
    private int field_j;
    private boolean field_k;
    private mn field_C;
    private long field_t;
    private boolean field_w;

    final int a(int param0, boolean param1) {
        rl var3 = (rl) ((Object) this.field_i.a(1, (long)param0));
        if (!param1) {
            String var4 = (String) null;
            tj.a(17, (String) null, (String) null);
        }
        if (var3 != null) {
            return var3.f((byte) 100);
        }
        return 0;
    }

    final static void a(int param0, String param1, String param2) {
        if (param0 != -1) {
            return;
        }
        try {
            if (null != ki.field_c) {
                ki.field_c.n(10);
            }
            om.field_p = new w(param1, param2, false, true, true);
            dn.field_b.a((fj) (om.field_p), (byte) -72);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "tj.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final rl a(int param0, int param1, int param2) {
        we discarded$2 = null;
        sm discarded$3 = null;
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        rl var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        Object stackIn_90_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_89_0 = null;
        L0: {
          var10 = Confined.field_J ? 1 : 0;
          var12 = (rl) ((Object) this.field_i.a(param0 + -13859, (long)param2));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (var12.field_t) {
                break L0;
              } else {
                if (!var12.field_v) {
                  break L0;
                } else {
                  var12.a(true);
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
              if (0 != param1) {
                if ((param1 ^ -1) != -2) {
                  if ((param1 ^ -1) == -3) {
                    if (this.field_s == null) {
                      throw new RuntimeException();
                    } else {
                      if (-1 == this.field_p[param2]) {
                        if (!this.field_q.b(-125)) {
                          var4 = this.field_q.a(this.field_u, false, -1911606496, param2, (byte) 2);
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (null == this.field_s) {
                    throw new RuntimeException();
                  } else {
                    var4 = this.field_o.a(this.field_s, 0, param2);
                    break L2;
                  }
                }
              } else {
                L3: {
                  if (this.field_s == null) {
                    break L3;
                  } else {
                    if (-1 == this.field_p[param2]) {
                      break L3;
                    } else {
                      var4 = this.field_o.a(param2, this.field_s, (byte) 53);
                      break L2;
                    }
                  }
                }
                if (!this.field_q.c(93)) {
                  var4 = this.field_q.a(this.field_u, true, -1911606496, param2, (byte) 2);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            this.field_i.a((rk) (var4), param0 ^ 13871, (long)param2);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((rl) (var4)).field_v) {
          L4: {
            var18 = ((rl) (var4)).e((byte) 94);
            var13 = var18;
            var5 = var13;
            if (param0 == 13860) {
              break L4;
            } else {
              discarded$2 = this.a((byte) 127);
              break L4;
            }
          }
          if (var4 instanceof sm) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if ((var18.length ^ -1) < -3) {
                      al.field_e.reset();
                      al.field_e.update(var5, 0, -2 + var18.length);
                      var6_int = (int)al.field_e.getValue();
                      if (var6_int != this.field_h.field_l[param2]) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          if (null == this.field_h.field_d) {
                            break L7;
                          } else {
                            if (this.field_h.field_d[param2] != null) {
                              var29 = this.field_h.field_d[param2];
                              var30 = in.a(0, var5, var18.length + -2, -26879);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if ((var11 ^ -1) <= -65) {
                                  break L7;
                                } else {
                                  if (var29[var11] == var30[var11]) {
                                    var11++;
                                    continue L8;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                        var7 = (var5[var18.length + -1] & 255) + ((var5[var18.length + -2] & 255) << 1711073096);
                        if (var7 == (this.field_h.field_o[param2] & 65535)) {
                          L9: {
                            if (-2 == (this.field_p[param2] ^ -1)) {
                              break L9;
                            } else {
                              L10: {
                                if (this.field_p[param2] != 0) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              this.field_p[param2] = (byte) 1;
                              break L9;
                            }
                          }
                          L11: {
                            if (((rl) (var4)).field_t) {
                              break L11;
                            } else {
                              ((rl) (var4)).a(true);
                              break L11;
                            }
                          }
                          stackOut_89_0 = var4;
                          stackIn_90_0 = stackOut_89_0;
                          break L5;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L12: {
                var6_ref = (Exception) (Object) decompiledCaughtException;
                this.field_p[param2] = (byte)-1;
                ((rl) (var4)).a(true);
                if (((rl) (var4)).field_t) {
                  if (!this.field_q.c(92)) {
                    var4 = this.field_q.a(this.field_u, true, -1911606496, param2, (byte) 2);
                    this.field_i.a((rk) (var4), 11, (long)param2);
                    break L12;
                  } else {
                    return null;
                  }
                } else {
                  break L12;
                }
              }
              return null;
            }
            return (rl) ((Object) stackIn_90_0);
          } else {
            try {
              L13: {
                L14: {
                  if (var5 == null) {
                    break L14;
                  } else {
                    if ((var18.length ^ -1) < -3) {
                      al.field_e.reset();
                      al.field_e.update(var5, 0, var18.length + -2);
                      var6_int = (int)al.field_e.getValue();
                      if (var6_int == this.field_h.field_l[param2]) {
                        L15: {
                          if (null == this.field_h.field_d) {
                            break L15;
                          } else {
                            if (null != this.field_h.field_d[param2]) {
                              var27 = this.field_h.field_d[param2];
                              var28 = in.a(0, var5, var18.length - 2, -26879);
                              var9 = 0;
                              L16: while (true) {
                                if (-65 >= (var9 ^ -1)) {
                                  break L15;
                                } else {
                                  if (var27[var9] == var28[var9]) {
                                    var9++;
                                    continue L16;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                        this.field_q.field_a = 0;
                        this.field_q.field_e = 0;
                        break L13;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (RuntimeException) (Object) decompiledCaughtException;
              this.field_q.a(true);
              ((rl) (var4)).a(true);
              if (((rl) (var4)).field_t) {
                L17: {
                  if (!this.field_q.c(param0 + -13755)) {
                    var4 = this.field_q.a(this.field_u, true, -1911606496, param2, (byte) 2);
                    this.field_i.a((rk) (var4), 11, (long)param2);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L18: {
              var5[var18.length + -2] = (byte)(this.field_h.field_o[param2] >>> 462725320);
              var5[var18.length - 1] = (byte)this.field_h.field_o[param2];
              if (this.field_s != null) {
                discarded$3 = this.field_o.a(this.field_s, -127, var18, param2);
                if ((this.field_p[param2] ^ -1) != -2) {
                  this.field_p[param2] = (byte) 1;
                  break L18;
                } else {
                  break L18;
                }
              } else {
                break L18;
              }
            }
            L19: {
              if (!((rl) (var4)).field_t) {
                ((rl) (var4)).a(true);
                break L19;
              } else {
                break L19;
              }
            }
            return (rl) (var4);
          }
        } else {
          return null;
        }
    }

    final byte[] a(int param0, int param1) {
        rl var3 = this.a(13860, param1, param0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.e((byte) 119);
        var3.a(true);
        return var4;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        fn.f(-1 + param4, param1 + -1, param3 - 1, -1 + param5, param0);
        fn.f(param4, param1 + -1, param3, -1 + param5, param0);
        fn.f(param4 + -1, param1, param3 - 1, param5, param0);
        if (param2 <= 13) {
            field_l = (int[][]) null;
        }
        fn.f(param4, param1, param3, param5, param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var5_int = param2 - -param4;
            if (param1 == 1) {
              L1: {
                var6 = param3 + param0;
                if (param2 > fn.field_c) {
                  stackOut_5_0 = param2;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = fn.field_c;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_6_0;
                if (param3 <= fn.field_b) {
                  stackOut_8_0 = fn.field_b;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = param3;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_9_0;
                if (var5_int >= fn.field_i) {
                  stackOut_11_0 = fn.field_i;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = var5_int;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_12_0;
                if (var6 >= fn.field_j) {
                  stackOut_14_0 = fn.field_j;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = var6;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              L5: {
                var10 = stackIn_15_0;
                if (fn.field_c > param2) {
                  break L5;
                } else {
                  if (fn.field_i <= param2) {
                    break L5;
                  } else {
                    var11 = param2 + fn.field_g * var8;
                    var12 = 1 - (-var10 + var8) >> 350580225;
                    L6: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L5;
                      } else {
                        fn.field_h[var11] = 16777215;
                        var11 = var11 + 2 * fn.field_g;
                        continue L6;
                      }
                    }
                  }
                }
              }
              L7: {
                if (fn.field_b > param3) {
                  break L7;
                } else {
                  if (fn.field_j > var6) {
                    var11 = var7 + fn.field_g * param3;
                    var12 = var9 + (1 + -var7) >> 193864673;
                    L8: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L7;
                      } else {
                        fn.field_h[var11] = 16777215;
                        var11 += 2;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                if (fn.field_c > var5_int) {
                  break L9;
                } else {
                  if (fn.field_i <= var5_int) {
                    break L9;
                  } else {
                    var11 = fn.field_g * ((1 & -param2 + var5_int) + var8) + var5_int;
                    var12 = 1 - (-var10 + var8) >> 1216086497;
                    L10: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L9;
                      } else {
                        fn.field_h[var11] = 16777215;
                        var11 = var11 + fn.field_g * 2;
                        continue L10;
                      }
                    }
                  }
                }
              }
              L11: {
                if (param3 < fn.field_b) {
                  break L11;
                } else {
                  if (fn.field_j <= var6) {
                    break L11;
                  } else {
                    var11 = (1 & -param3 + var6) + var7 + fn.field_g * var6;
                    var12 = -var7 + 1 + var9 >> 1040869121;
                    L12: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L11;
                      } else {
                        fn.field_h[var11] = 16777215;
                        var11 += 2;
                        continue L12;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var5), "tj.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        rl discarded$4 = null;
        rl discarded$5 = null;
        rl discarded$6 = null;
        rl discarded$7 = null;
        int var2 = 0;
        rk var3 = null;
        rl var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        rk var6 = null;
        rk var7 = null;
        L0: {
          L1: {
            L2: {
              var5 = Confined.field_J ? 1 : 0;
              if (this.field_r != null) {
                if (this.a((byte) -61) == null) {
                  return;
                } else {
                  if (this.field_m) {
                    var2 = 1;
                    var3 = this.field_r.a(-125);
                    L3: while (true) {
                      if (var3 == null) {
                        L4: while (true) {
                          L5: {
                            if (this.field_j >= this.field_h.field_t.length) {
                              break L5;
                            } else {
                              L6: {
                                if (this.field_h.field_t[this.field_j] == 0) {
                                  break L6;
                                } else {
                                  if (this.field_o.field_b >= 250) {
                                    var2 = 0;
                                    break L5;
                                  } else {
                                    L7: {
                                      if (-1 != (this.field_p[this.field_j] ^ -1)) {
                                        break L7;
                                      } else {
                                        discarded$4 = this.a(13860, 1, this.field_j);
                                        break L7;
                                      }
                                    }
                                    if (0 == this.field_p[this.field_j]) {
                                      var7 = new rk();
                                      var7.field_i = (long)this.field_j;
                                      this.field_r.a(var7, (byte) -98);
                                      var2 = 0;
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              this.field_j = this.field_j + 1;
                              continue L4;
                            }
                          }
                          if (var2 == 0) {
                            break L2;
                          } else {
                            this.field_m = false;
                            this.field_j = 0;
                            break L2;
                          }
                        }
                      } else {
                        L8: {
                          var4 = (int)var3.field_i;
                          if (this.field_p[var4] != 0) {
                            break L8;
                          } else {
                            discarded$5 = this.a(13860, 1, var4);
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_p[var4] != 0) {
                            var3.a(true);
                            break L9;
                          } else {
                            var2 = 0;
                            break L9;
                          }
                        }
                        var3 = this.field_r.d(2123);
                        continue L3;
                      }
                    }
                  } else {
                    if (!this.field_k) {
                      this.field_r = null;
                      break L2;
                    } else {
                      var2 = 1;
                      var3 = this.field_r.a(87);
                      L10: while (true) {
                        if (var3 == null) {
                          L11: while (true) {
                            L12: {
                              if (this.field_j >= this.field_h.field_t.length) {
                                break L12;
                              } else {
                                L13: {
                                  if (this.field_h.field_t[this.field_j] == 0) {
                                    break L13;
                                  } else {
                                    if (this.field_q.b(-124)) {
                                      var2 = 0;
                                      break L12;
                                    } else {
                                      L14: {
                                        if (-2 == (this.field_p[this.field_j] ^ -1)) {
                                          break L14;
                                        } else {
                                          discarded$6 = this.a(13860, 2, this.field_j);
                                          break L14;
                                        }
                                      }
                                      if (-2 != (this.field_p[this.field_j] ^ -1)) {
                                        var6 = new rk();
                                        var6.field_i = (long)this.field_j;
                                        this.field_r.a(var6, (byte) -84);
                                        var2 = 0;
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                                this.field_j = this.field_j + 1;
                                continue L11;
                              }
                            }
                            if (var2 != 0) {
                              this.field_k = false;
                              this.field_j = 0;
                              break L2;
                            } else {
                              var2 = -50 / ((-13 - param0) / 63);
                              if (!this.field_w) {
                                break L0;
                              } else {
                                if (this.field_t <= ri.a(-3)) {
                                  var3_ref = (rl) ((Object) this.field_i.a(true));
                                  L15: while (true) {
                                    if (var3_ref == null) {
                                      break L1;
                                    } else {
                                      L16: {
                                        if (var3_ref.field_v) {
                                          break L16;
                                        } else {
                                          if (!var3_ref.field_w) {
                                            var3_ref.field_w = true;
                                            break L16;
                                          } else {
                                            if (var3_ref.field_t) {
                                              var3_ref.a(true);
                                              break L16;
                                            } else {
                                              throw new RuntimeException();
                                            }
                                          }
                                        }
                                      }
                                      var3_ref = (rl) ((Object) this.field_i.a(70));
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
                            if ((this.field_p[var4] ^ -1) != -2) {
                              discarded$7 = this.a(13860, 2, var4);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L18: {
                            if (this.field_p[var4] == 1) {
                              var3.a(true);
                              break L18;
                            } else {
                              var2 = 0;
                              break L18;
                            }
                          }
                          var3 = this.field_r.d(2123);
                          continue L10;
                        }
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            var2 = -50 / ((-13 - param0) / 63);
            if (!this.field_w) {
              break L0;
            } else {
              if (this.field_t <= ri.a(-3)) {
                var3_ref = (rl) ((Object) this.field_i.a(true));
                L19: while (true) {
                  if (var3_ref == null) {
                    break L1;
                  } else {
                    L20: {
                      if (var3_ref.field_v) {
                        break L20;
                      } else {
                        if (!var3_ref.field_w) {
                          var3_ref.field_w = true;
                          break L20;
                        } else {
                          if (var3_ref.field_t) {
                            var3_ref.a(true);
                            break L20;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                    var3_ref = (rl) ((Object) this.field_i.a(70));
                    continue L19;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          this.field_t = ri.a(-3) - -1000L;
          break L0;
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        if (param1 == 480) {
          L0: {
            if (0 >= sg.field_x) {
              if (!tj.a(true)) {
                var2 = 1;
                break L0;
              } else {
                var2 = 0;
                break L0;
              }
            } else {
              L1: {
                if (null == gg.field_m) {
                  dn.field_d = id.a(2401, ki.field_d, 640, 0, 0, 480);
                  break L1;
                } else {
                  dn.field_d = gg.field_m.a(20742);
                  jk.a(2, false);
                  break L1;
                }
              }
              if (dn.field_d == null) {
                var2 = 3;
                break L0;
              } else {
                ac.a(dn.field_d, (byte) -79);
                var2 = 2;
                break L0;
              }
            }
          }
          L2: {
            if (null != gg.field_m) {
              break L2;
            } else {
              if (eh.field_gb) {
                q.a(var2, param0, (byte) -107);
                break L2;
              } else {
                break L2;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final we a(byte param0) {
        sm discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        if (null == this.field_h) {
          L0: {
            if (null == this.field_y) {
              if (!this.field_q.c(91)) {
                this.field_y = (rl) ((Object) this.field_q.a(255, true, -1911606496, this.field_u, (byte) 0));
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (param0 < -26) {
            if (!this.field_y.field_v) {
              L1: {
                var7 = this.field_y.e((byte) 116);
                var6 = var7;
                var5 = var6;
                var2 = var5;
                if (!(this.field_y instanceof sm)) {
                  try {
                    L2: {
                      if (var5 != null) {
                        this.field_h = new we(var7, this.field_x, this.field_B);
                        break L2;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      this.field_q.a(true);
                      this.field_h = null;
                      if (this.field_q.c(-45)) {
                        this.field_y = null;
                        break L3;
                      } else {
                        this.field_y = (rl) ((Object) this.field_q.a(255, true, -1911606496, this.field_u, (byte) 0));
                        break L3;
                      }
                    }
                    return null;
                  }
                  if (null == this.field_v) {
                    break L1;
                  } else {
                    discarded$1 = this.field_o.a(this.field_v, -123, var7, this.field_u);
                    break L1;
                  }
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        this.field_h = new we(var7, this.field_x, this.field_B);
                        if (this.field_h.field_m == this.field_D) {
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
                      this.field_h = null;
                      if (!this.field_q.c(-69)) {
                        this.field_y = (rl) ((Object) this.field_q.a(255, true, -1911606496, this.field_u, (byte) 0));
                        break L5;
                      } else {
                        this.field_y = null;
                        break L5;
                      }
                    }
                    return null;
                  }
                  break L1;
                }
              }
              L6: {
                this.field_y = null;
                if (this.field_s != null) {
                  this.field_p = new byte[this.field_h.field_i];
                  break L6;
                } else {
                  break L6;
                }
              }
              return this.field_h;
            } else {
              return null;
            }
          } else {
            return (we) null;
          }
        } else {
          return this.field_h;
        }
    }

    final void c(byte param0) {
        int var3 = 0;
        rl discarded$0 = null;
        rl discarded$1 = null;
        int var4 = Confined.field_J ? 1 : 0;
        if (!(this.field_r != null)) {
            return;
        }
        if (!(this.a((byte) -49) != null)) {
            return;
        }
        if (param0 >= -106) {
            return;
        }
        rk var2 = this.field_C.a(-115);
        while (var2 != null) {
            var3 = (int)var2.field_i;
            if (-1 < (var3 ^ -1)) {
                var2.a(true);
            } else {
                if (this.field_h.field_i <= var3) {
                    var2.a(true);
                } else {
                    if (this.field_h.field_t[var3] == 0) {
                        var2.a(true);
                    } else {
                        if (this.field_p[var3] == 0) {
                            discarded$0 = this.a(13860, 1, var3);
                        }
                        if (!((this.field_p[var3] ^ -1) != 0)) {
                            discarded$1 = this.a(13860, 2, var3);
                        }
                        if ((this.field_p[var3] ^ -1) == -2) {
                            var2.a(true);
                        }
                    }
                }
            }
            var2 = this.field_C.d(2123);
        }
    }

    public static void c(int param0) {
        field_z = null;
        field_n = null;
        field_l = (int[][]) null;
        int var1 = 115 % ((param0 - -31) / 61);
        field_E = null;
        field_F = null;
        field_A = null;
    }

    final void b(int param0) {
        if (null == this.field_s) {
            return;
        }
        this.field_k = true;
        if (param0 != -2) {
            field_A = (int[]) null;
        }
        if (!(null != this.field_r)) {
            this.field_r = new mn();
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return fd.field_j;
    }

    tj(int param0, ae param1, ae param2, jf param3, pc param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_i = new vh(16);
        this.field_j = 0;
        this.field_C = new mn();
        this.field_t = 0L;
        try {
          L0: {
            L1: {
              this.field_u = param0;
              this.field_s = param1;
              if (this.field_s == null) {
                this.field_m = false;
                break L1;
              } else {
                this.field_m = true;
                this.field_r = new mn();
                break L1;
              }
            }
            L2: {
              this.field_q = param3;
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
              ((tj) (this)).field_w = stackIn_7_1 != 0;
              this.field_o = param4;
              this.field_x = param5;
              this.field_v = param2;
              this.field_D = param7;
              this.field_B = param6;
              if (this.field_v == null) {
                break L3;
              } else {
                this.field_y = (rl) ((Object) this.field_o.a(this.field_u, this.field_v, (byte) 53));
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var10);
            stackOut_10_1 = new StringBuilder().append("tj.<init>(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
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
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
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
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
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
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_E = "If you get it right, the bolt of#energy it delivers is devastating.#Do not fly through the explosion!";
        field_n = new al("usename");
        field_F = "Extra lives";
        field_A = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        field_z = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
