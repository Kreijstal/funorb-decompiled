/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up extends lh {
    static int[] field_p;
    private int field_u;
    static int[] field_M;
    private int field_k;
    static String field_w;
    static int field_j;
    static int field_l;
    private ad field_z;
    static String field_L;
    private bm field_G;
    static String field_K;
    private byte[] field_E;
    private int field_y;
    static String field_I;
    static String field_v;
    private np field_t;
    static int field_m;
    private no field_r;
    private np field_n;
    private rn field_D;
    static String field_J;
    private gr field_H;
    private byte[] field_o;
    private int field_x;
    private boolean field_B;
    private boolean field_C;
    private ko field_q;
    private ko field_s;
    private long field_F;
    private boolean field_A;

    final void c(int param0) {
        int var3 = 0;
        gr discarded$0 = null;
        gr discarded$1 = null;
        String discarded$2 = null;
        int var4 = Pool.field_O;
        if (this.field_s == null) {
            return;
        }
        if (!(this.b((byte) -21) != null)) {
            return;
        }
        ma var2 = this.field_q.c((byte) 111);
        while (var2 != null) {
            var3 = (int)var2.field_c;
            if (0 > var3) {
                var2.a((byte) -117);
            } else {
                if (var3 >= this.field_z.field_d) {
                    var2.a((byte) -117);
                } else {
                    if (this.field_z.field_s[var3] == 0) {
                        var2.a((byte) -117);
                    } else {
                        if (!(this.field_E[var3] != 0)) {
                            discarded$0 = this.a(var3, 1, (byte) 25);
                        }
                        if (!((this.field_E[var3] ^ -1) != 0)) {
                            discarded$1 = this.a(var3, 2, (byte) 25);
                        }
                        if (!(this.field_E[var3] != 1)) {
                            var2.a((byte) -117);
                        }
                    }
                }
            }
            var2 = this.field_q.f((byte) -5);
        }
        if (param0 <= 82) {
            CharSequence var5 = (CharSequence) null;
            discarded$2 = up.a(false, (CharSequence) null, (byte) 71);
        }
    }

    final void b(int param0) {
        if (null == this.field_t) {
          return;
        } else {
          L0: {
            if (param0 >= 78) {
              break L0;
            } else {
              field_J = (String) null;
              break L0;
            }
          }
          L1: {
            this.field_B = true;
            if (null == this.field_s) {
              this.field_s = new ko();
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final int a(int param0, int param1) {
        byte[] discarded$2 = null;
        gr var3 = null;
        L0: {
          if (param0 == -18600) {
            break L0;
          } else {
            discarded$2 = this.a(100, (byte) -43);
            break L0;
          }
        }
        var3 = (gr) ((Object) this.field_G.a(false, (long)param1));
        if (var3 != null) {
          return var3.e(54);
        } else {
          return 0;
        }
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_34_0 = null;
        String stackOut_29_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = Pool.field_O;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = hq.a(91, param1);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if ((var4.length() ^ -1) > -2) {
                          break L2;
                        } else {
                          L3: {
                            if (qd.a(0, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (qd.a(0, var4.charAt(var4.length() + -1))) {
                                break L3;
                              } else {
                                L4: {
                                  var5 = 0;
                                  if (param2 >= 96) {
                                    break L4;
                                  } else {
                                    discarded$1 = up.a(-125);
                                    break L4;
                                  }
                                }
                                var6 = 0;
                                L5: while (true) {
                                  if (param1.length() <= var6) {
                                    if (-1 > (var5 ^ -1)) {
                                      stackOut_34_0 = lg.field_r;
                                      stackIn_35_0 = stackOut_34_0;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param1.charAt(var6);
                                      if (qd.a(0, (char) var7)) {
                                        var5++;
                                        break L6;
                                      } else {
                                        var5 = 0;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (-3 < (var5 ^ -1)) {
                                        break L7;
                                      } else {
                                        if (!param0) {
                                          stackOut_29_0 = oh.field_g;
                                          stackIn_30_0 = stackOut_29_0;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L5;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_17_0 = lg.field_r;
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackOut_12_0 = gp.field_a;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackOut_7_0 = gp.field_a;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = gp.field_a;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var3);
            stackOut_36_1 = new StringBuilder().append("up.K(").append(param0).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0;
                } else {
                  return stackIn_35_0;
                }
              }
            }
          }
        }
    }

    final static int a(int param0) {
        if (param0 != -21282) {
            return 111;
        }
        return (int)(1000000000L / oh.field_e);
    }

    final static dd[] a(dd[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dd var3 = null;
        int var4 = 0;
        dd[] stackIn_3_0 = null;
        dd[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dd[] stackOut_7_0 = null;
        dd[] stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            if (param1 == 12519) {
              var2_int = 0;
              L1: while (true) {
                if (param0.length <= var2_int) {
                  stackOut_7_0 = (dd[]) (param0);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = param0[var2_int];
                  param0[var2_int].field_B = 0;
                  var3.field_G = 0;
                  param0[var2_int].field_w = param0[var2_int].field_z;
                  param0[var2_int].field_y = param0[var2_int].field_A;
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = (dd[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("up.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final ad b(byte param0) {
        dg discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        if (null == this.field_z) {
          L0: {
            if (null != this.field_H) {
              break L0;
            } else {
              if (!this.field_r.b((byte) -125)) {
                this.field_H = (gr) ((Object) this.field_r.a(this.field_k, 255, (byte) 0, true, -154018400));
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!this.field_H.field_F) {
            L1: {
              var7 = this.field_H.b(false);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (!(this.field_H instanceof dg)) {
                try {
                  L2: {
                    if (var5 != null) {
                      this.field_z = new ad(var7, this.field_y, this.field_o);
                      break L2;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    this.field_r.a((byte) -123);
                    this.field_z = null;
                    if (!this.field_r.b((byte) -125)) {
                      this.field_H = (gr) ((Object) this.field_r.a(this.field_k, 255, (byte) 0, true, -154018400));
                      break L3;
                    } else {
                      this.field_H = null;
                      break L3;
                    }
                  }
                  return null;
                }
                if (this.field_n != null) {
                  discarded$1 = this.field_D.a(var7, this.field_n, (byte) -128, this.field_k);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                try {
                  L4: {
                    if (var5 != null) {
                      this.field_z = new ad(var7, this.field_y, this.field_o);
                      if (this.field_u == this.field_z.field_h) {
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
                    this.field_z = null;
                    if (this.field_r.b((byte) -125)) {
                      this.field_H = null;
                      break L5;
                    } else {
                      this.field_H = (gr) ((Object) this.field_r.a(this.field_k, 255, (byte) 0, true, -154018400));
                      break L5;
                    }
                  }
                  return null;
                }
                break L1;
              }
            }
            L6: {
              if (param0 == -21) {
                break L6;
              } else {
                up.a(false);
                break L6;
              }
            }
            L7: {
              this.field_H = null;
              if (this.field_t == null) {
                break L7;
              } else {
                this.field_E = new byte[this.field_z.field_d];
                break L7;
              }
            }
            return this.field_z;
          } else {
            return null;
          }
        } else {
          return this.field_z;
        }
    }

    public static void a(boolean param0) {
        field_J = null;
        field_M = null;
        field_I = null;
        field_w = null;
        field_L = null;
        field_p = null;
        field_v = null;
        field_K = null;
        if (!param0) {
            field_w = (String) null;
        }
    }

    private final gr a(int param0, int param1, byte param2) {
        dg discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        gr var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        Object stackIn_88_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_87_0 = null;
        var10 = Pool.field_O;
        var12 = (gr) ((Object) this.field_G.a(false, (long)param0));
        var4 = var12;
        if (param2 == 25) {
          L0: {
            if (var12 == null) {
              break L0;
            } else {
              if (param1 != 0) {
                break L0;
              } else {
                if (var12.field_x) {
                  break L0;
                } else {
                  if (!var12.field_F) {
                    break L0;
                  } else {
                    var12.a((byte) -117);
                    var4 = null;
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
                if (-1 == (param1 ^ -1)) {
                  L3: {
                    if (null == this.field_t) {
                      break L3;
                    } else {
                      if ((this.field_E[param0] ^ -1) != 0) {
                        var4 = this.field_D.a(121, this.field_t, param0);
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (!this.field_r.b((byte) -125)) {
                    var4 = this.field_r.a(param0, this.field_k, (byte) 2, true, -154018400);
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  if (param1 == 1) {
                    if (this.field_t != null) {
                      var4 = this.field_D.a((byte) 58, this.field_t, param0);
                      break L2;
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    if ((param1 ^ -1) == -3) {
                      if (this.field_t == null) {
                        throw new RuntimeException();
                      } else {
                        if ((this.field_E[param0] ^ -1) != 0) {
                          throw new RuntimeException();
                        } else {
                          if (!this.field_r.a(param2 ^ 13)) {
                            var4 = this.field_r.a(param0, this.field_k, (byte) 2, false, -154018400);
                            break L2;
                          } else {
                            return null;
                          }
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
              this.field_G.a((byte) -114, (ma) (var4), (long)param0);
              break L1;
            }
          }
          if (!((gr) (var4)).field_F) {
            var18 = ((gr) (var4)).b(false);
            var13 = var18;
            var5 = var13;
            if (var4 instanceof dg) {
              try {
                L4: {
                  L5: {
                    if (var5 == null) {
                      break L5;
                    } else {
                      if ((var18.length ^ -1) < -3) {
                        oq.field_B.reset();
                        oq.field_B.update(var5, 0, -2 + var18.length);
                        var6_int = (int)oq.field_B.getValue();
                        if (var6_int == this.field_z.field_w[param0]) {
                          L6: {
                            if (null == this.field_z.field_a) {
                              break L6;
                            } else {
                              if (null == this.field_z.field_a[param0]) {
                                break L6;
                              } else {
                                var29 = this.field_z.field_a[param0];
                                var30 = jr.a(-2 + var18.length, (byte) -83, var18, 0);
                                var11 = 0;
                                var9 = var11;
                                L7: while (true) {
                                  if (64 <= var11) {
                                    break L6;
                                  } else {
                                    if (var29[var11] == var30[var11]) {
                                      var11++;
                                      continue L7;
                                    } else {
                                      throw new RuntimeException();
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var7 = (var5[-1 + var18.length] & 255) + ((255 & var5[-2 + var18.length]) << -1614229976);
                          if (var7 == (this.field_z.field_i[param0] & 65535)) {
                            L8: {
                              if (this.field_E[param0] != 1) {
                                L9: {
                                  if (this.field_E[param0] == 0) {
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                this.field_E[param0] = (byte) 1;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L10: {
                              if (!((gr) (var4)).field_x) {
                                ((gr) (var4)).a((byte) -117);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            stackOut_87_0 = var4;
                            stackIn_88_0 = stackOut_87_0;
                            break L4;
                          } else {
                            throw new RuntimeException();
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
                var6_ref = (Exception) (Object) decompiledCaughtException;
                this.field_E[param0] = (byte)-1;
                ((gr) (var4)).a((byte) -117);
                if (!((gr) (var4)).field_x) {
                  return null;
                } else {
                  L11: {
                    if (!this.field_r.b((byte) -125)) {
                      var4 = this.field_r.a(param0, this.field_k, (byte) 2, true, param2 ^ -154018375);
                      this.field_G.a((byte) -127, (ma) (var4), (long)param0);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return null;
                }
              }
              return (gr) ((Object) stackIn_88_0);
            } else {
              try {
                L12: {
                  L13: {
                    if (var5 == null) {
                      break L13;
                    } else {
                      if (2 >= var18.length) {
                        break L13;
                      } else {
                        oq.field_B.reset();
                        oq.field_B.update(var5, 0, var18.length + -2);
                        var6_int = (int)oq.field_B.getValue();
                        if (var6_int == this.field_z.field_w[param0]) {
                          L14: {
                            if (this.field_z.field_a == null) {
                              break L14;
                            } else {
                              if (null == this.field_z.field_a[param0]) {
                                break L14;
                              } else {
                                var27 = this.field_z.field_a[param0];
                                var28 = jr.a(var18.length + -2, (byte) -76, var18, 0);
                                var9 = 0;
                                L15: while (true) {
                                  if (64 <= var9) {
                                    break L14;
                                  } else {
                                    if (var27[var9] != var28[var9]) {
                                      throw new RuntimeException();
                                    } else {
                                      var9++;
                                      continue L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          this.field_r.field_e = 0;
                          this.field_r.field_a = 0;
                          break L12;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                this.field_r.a((byte) -53);
                ((gr) (var4)).a((byte) -117);
                if (((gr) (var4)).field_x) {
                  if (this.field_r.b((byte) -125)) {
                    return null;
                  } else {
                    var4 = this.field_r.a(param0, this.field_k, (byte) 2, true, -154018400);
                    this.field_G.a((byte) -124, (ma) (var4), (long)param0);
                    return null;
                  }
                } else {
                  return null;
                }
              }
              L16: {
                var5[var18.length - 2] = (byte)(this.field_z.field_i[param0] >>> -426587352);
                var5[var18.length + -1] = (byte)this.field_z.field_i[param0];
                if (this.field_t != null) {
                  discarded$1 = this.field_D.a(var18, this.field_t, (byte) -98, param0);
                  if ((this.field_E[param0] ^ -1) == -2) {
                    break L16;
                  } else {
                    this.field_E[param0] = (byte) 1;
                    break L16;
                  }
                } else {
                  break L16;
                }
              }
              L17: {
                if (((gr) (var4)).field_x) {
                  break L17;
                } else {
                  ((gr) (var4)).a((byte) -117);
                  break L17;
                }
              }
              return (gr) (var4);
            }
          } else {
            return null;
          }
        } else {
          return (gr) null;
        }
    }

    final void c(byte param0) {
        gr discarded$4 = null;
        gr discarded$5 = null;
        gr discarded$6 = null;
        gr discarded$7 = null;
        int var2_int = 0;
        gr var2 = null;
        ma var3 = null;
        int var4 = 0;
        int var5 = 0;
        ma var6 = null;
        ma var7 = null;
        L0: {
          var5 = Pool.field_O;
          if (this.field_s == null) {
            break L0;
          } else {
            if (null == this.b((byte) -21)) {
              return;
            } else {
              if (this.field_C) {
                var2_int = 1;
                var3 = this.field_s.c((byte) 78);
                L1: while (true) {
                  if (var3 == null) {
                    L2: while (true) {
                      L3: {
                        if (this.field_x >= this.field_z.field_s.length) {
                          break L3;
                        } else {
                          if (this.field_z.field_s[this.field_x] != 0) {
                            if (this.field_D.field_e >= 250) {
                              var2_int = 0;
                              break L3;
                            } else {
                              L4: {
                                if (this.field_E[this.field_x] != 0) {
                                  break L4;
                                } else {
                                  discarded$4 = this.a(this.field_x, 1, (byte) 25);
                                  break L4;
                                }
                              }
                              L5: {
                                if (this.field_E[this.field_x] != 0) {
                                  break L5;
                                } else {
                                  var7 = new ma();
                                  var7.field_c = (long)this.field_x;
                                  this.field_s.b((byte) -64, var7);
                                  var2_int = 0;
                                  break L5;
                                }
                              }
                              this.field_x = this.field_x + 1;
                              continue L2;
                            }
                          } else {
                            this.field_x = this.field_x + 1;
                            continue L2;
                          }
                        }
                      }
                      if (var2_int == 0) {
                        break L0;
                      } else {
                        this.field_C = false;
                        this.field_x = 0;
                        break L0;
                      }
                    }
                  } else {
                    L6: {
                      var4 = (int)var3.field_c;
                      if (0 != this.field_E[var4]) {
                        break L6;
                      } else {
                        discarded$5 = this.a(var4, 1, (byte) 25);
                        break L6;
                      }
                    }
                    L7: {
                      if (-1 != (this.field_E[var4] ^ -1)) {
                        var3.a((byte) -117);
                        break L7;
                      } else {
                        var2_int = 0;
                        break L7;
                      }
                    }
                    var3 = this.field_s.f((byte) -5);
                    continue L1;
                  }
                }
              } else {
                if (!this.field_B) {
                  this.field_s = null;
                  break L0;
                } else {
                  var2_int = 1;
                  var3 = this.field_s.c((byte) -58);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (this.field_x >= this.field_z.field_s.length) {
                            break L10;
                          } else {
                            L11: {
                              if (this.field_z.field_s[this.field_x] == 0) {
                                break L11;
                              } else {
                                if (this.field_r.a(20)) {
                                  var2_int = 0;
                                  break L10;
                                } else {
                                  L12: {
                                    if (this.field_E[this.field_x] == 1) {
                                      break L12;
                                    } else {
                                      discarded$6 = this.a(this.field_x, 2, (byte) 25);
                                      break L12;
                                    }
                                  }
                                  if (this.field_E[this.field_x] == 1) {
                                    break L11;
                                  } else {
                                    var6 = new ma();
                                    var6.field_c = (long)this.field_x;
                                    var2_int = 0;
                                    this.field_s.b((byte) 96, var6);
                                    break L11;
                                  }
                                }
                              }
                            }
                            this.field_x = this.field_x + 1;
                            continue L9;
                          }
                        }
                        if (var2_int != 0) {
                          this.field_B = false;
                          this.field_x = 0;
                          break L0;
                        } else {
                          if (this.field_A) {
                            if ((rl.a((byte) -124) ^ -1L) <= (this.field_F ^ -1L)) {
                              var2 = (gr) ((Object) this.field_G.a(0));
                              L13: while (true) {
                                if (var2 != null) {
                                  L14: {
                                    if (var2.field_F) {
                                      break L14;
                                    } else {
                                      if (!var2.field_C) {
                                        var2.field_C = true;
                                        break L14;
                                      } else {
                                        if (!var2.field_x) {
                                          throw new RuntimeException();
                                        } else {
                                          var2.a((byte) -117);
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                  var2 = (gr) ((Object) this.field_G.b(-1));
                                  continue L13;
                                } else {
                                  this.field_F = rl.a((byte) -107) + 1000L;
                                  var2_int = 86 % ((param0 - 82) / 40);
                                  return;
                                }
                              }
                            } else {
                              var2_int = 86 % ((param0 - 82) / 40);
                              return;
                            }
                          } else {
                            var2_int = 86 % ((param0 - 82) / 40);
                            return;
                          }
                        }
                      }
                    } else {
                      L15: {
                        var4 = (int)var3.field_c;
                        if (this.field_E[var4] == 1) {
                          break L15;
                        } else {
                          discarded$7 = this.a(var4, 2, (byte) 25);
                          break L15;
                        }
                      }
                      L16: {
                        if ((this.field_E[var4] ^ -1) == -2) {
                          var3.a((byte) -117);
                          break L16;
                        } else {
                          var2_int = 0;
                          break L16;
                        }
                      }
                      var3 = this.field_s.f((byte) -5);
                      continue L8;
                    }
                  }
                }
              }
            }
          }
        }
        if (this.field_A) {
          if ((rl.a((byte) -124) ^ -1L) <= (this.field_F ^ -1L)) {
            var2 = (gr) ((Object) this.field_G.a(0));
            L17: while (true) {
              if (var2 != null) {
                L18: {
                  if (var2.field_F) {
                    break L18;
                  } else {
                    if (!var2.field_C) {
                      var2.field_C = true;
                      break L18;
                    } else {
                      if (!var2.field_x) {
                        throw new RuntimeException();
                      } else {
                        var2.a((byte) -117);
                        break L18;
                      }
                    }
                  }
                }
                var2 = (gr) ((Object) this.field_G.b(-1));
                continue L17;
              } else {
                this.field_F = rl.a((byte) -107) + 1000L;
                var2_int = 86 % ((param0 - 82) / 40);
                return;
              }
            }
          } else {
            var2_int = 86 % ((param0 - 82) / 40);
            return;
          }
        } else {
          var2_int = 86 % ((param0 - 82) / 40);
          return;
        }
    }

    final byte[] a(int param0, byte param1) {
        gr var3 = null;
        byte[] var4 = null;
        var3 = this.a(param0, 0, (byte) 25);
        if (var3 != null) {
          if (param1 != 19) {
            return (byte[]) null;
          } else {
            var4 = var3.b(false);
            var3.a((byte) -117);
            return var4;
          }
        } else {
          return null;
        }
    }

    up(int param0, np param1, np param2, no param3, rn param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_G = new bm(16);
        this.field_x = 0;
        this.field_q = new ko();
        this.field_F = 0L;
        try {
          L0: {
            L1: {
              this.field_k = param0;
              this.field_t = param1;
              if (null != this.field_t) {
                this.field_C = true;
                this.field_s = new ko();
                break L1;
              } else {
                this.field_C = false;
                break L1;
              }
            }
            L2: {
              this.field_o = param6;
              this.field_n = param2;
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
              ((up) (this)).field_A = stackIn_7_1 != 0;
              this.field_y = param5;
              this.field_u = param7;
              this.field_r = param3;
              this.field_D = param4;
              if (this.field_n == null) {
                break L3;
              } else {
                this.field_H = (gr) ((Object) this.field_D.a(92, this.field_n, this.field_k));
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
            stackOut_10_1 = new StringBuilder().append("up.<init>(").append(param0).append(',');
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
          throw wm.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_M = new int[7];
        field_K = "The invitation has been withdrawn.";
        field_v = "Sound: ";
        field_I = "<%0> has joined your game.";
        field_L = "Press and hold the <img=0> on the cue ball to move it.";
        field_m = -1;
        field_w = "OVER <%0>";
        field_J = "Rematch";
    }
}
