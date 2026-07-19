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
        byte[] discarded$0 = null;
        vv var3 = (vv) ((Object) this.field_v.a(true, (long)param1));
        if (var3 != null) {
            return var3.a(0);
        }
        if (param0 != 6999) {
            discarded$0 = this.b(-39, 41);
            return 0;
        }
        return 0;
    }

    final void d(int param0) {
        int var3 = 0;
        vv discarded$0 = null;
        vv discarded$1 = null;
        int var4 = Kickabout.field_G;
        if (param0 != 18137) {
            return;
        }
        if (null == this.field_t) {
            return;
        }
        if (this.a(param0 + -42991) == null) {
            return;
        }
        gn var2 = this.field_F.g(24009);
        while (var2 != null) {
            var3 = (int)var2.field_a;
            if ((var3 ^ -1) > -1) {
                var2.c((byte) -109);
            } else {
                if (this.field_z.field_d <= var3) {
                    var2.c((byte) -109);
                } else {
                    if (this.field_z.field_i[var3] == 0) {
                        var2.c((byte) -109);
                    } else {
                        if (!(this.field_r[var3] != 0)) {
                            discarded$0 = this.a(1, var3, (byte) -30);
                        }
                        if (-1 == this.field_r[var3]) {
                            discarded$1 = this.a(2, var3, (byte) -30);
                        }
                        if (!(-2 != (this.field_r[var3] ^ -1))) {
                            var2.c((byte) -109);
                        }
                    }
                }
            }
            var2 = this.field_F.c(33);
        }
    }

    final static boolean c(byte param0) {
        if (!vg.field_Wb) {
            return false;
        }
        int var1 = -4 / ((-84 - param0) / 34);
        if (0 == ov.field_b) {
            return true;
        }
        return false;
    }

    final static void c(int param0) {
        if (param0 != 1) {
            field_u = (ae) null;
        }
    }

    final void b(byte param0) {
        if (!(this.field_k != null)) {
            return;
        }
        this.field_g = true;
        if (!(this.field_t != null)) {
            this.field_t = new tf();
        }
        if (param0 < 28) {
            this.field_n = true;
        }
    }

    final kl a(int param0) {
        hi discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        if (this.field_z != null) {
          return this.field_z;
        } else {
          L0: {
            if (null == this.field_B) {
              if (!this.field_l.a(25533)) {
                this.field_B = (vv) ((Object) this.field_l.a(255, this.field_h, (byte) 0, (byte) 89, true));
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_B.field_p) {
            L1: {
              var7 = this.field_B.b(12802);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (this.field_B instanceof hi) {
                try {
                  L2: {
                    if (var5 != null) {
                      this.field_z = new kl(var7, this.field_D, this.field_x);
                      if (this.field_z.field_p == this.field_j) {
                        break L2;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    this.field_z = null;
                    if (this.field_l.a(param0 + 50387)) {
                      this.field_B = null;
                      break L3;
                    } else {
                      this.field_B = (vv) ((Object) this.field_l.a(255, this.field_h, (byte) 0, (byte) 89, true));
                      break L3;
                    }
                  }
                  return null;
                }
                break L1;
              } else {
                try {
                  L4: {
                    if (var5 != null) {
                      this.field_z = new kl(var7, this.field_D, this.field_x);
                      break L4;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var3 = decompiledCaughtException;
                    this.field_l.c(-65);
                    this.field_z = null;
                    if (!this.field_l.a(param0 + 50387)) {
                      this.field_B = (vv) ((Object) this.field_l.a(255, this.field_h, (byte) 0, (byte) 89, true));
                      break L5;
                    } else {
                      this.field_B = null;
                      break L5;
                    }
                  }
                  return null;
                }
                if (this.field_q != null) {
                  discarded$1 = this.field_w.a(this.field_h, this.field_q, var7, (byte) 11);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (param0 == -24854) {
                break L6;
              } else {
                this.b(113);
                break L6;
              }
            }
            L7: {
              if (null != this.field_k) {
                this.field_r = new byte[this.field_z.field_d];
                break L7;
              } else {
                break L7;
              }
            }
            this.field_B = null;
            return this.field_z;
          } else {
            return null;
          }
        }
    }

    final void b(int param0) {
        vv discarded$4 = null;
        vv discarded$5 = null;
        vv discarded$6 = null;
        vv discarded$7 = null;
        int var2 = 0;
        gn var3 = null;
        vv var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        gn var6 = null;
        gn var7 = null;
        L0: {
          L1: {
            L2: {
              var5 = Kickabout.field_G;
              if (this.field_t != null) {
                if (null != this.a(-24854)) {
                  if (!this.field_n) {
                    if (!this.field_g) {
                      this.field_t = null;
                      break L2;
                    } else {
                      var2 = 1;
                      var3 = this.field_t.g(24009);
                      L3: while (true) {
                        if (var3 == null) {
                          L4: while (true) {
                            L5: {
                              if (this.field_i >= this.field_z.field_i.length) {
                                break L5;
                              } else {
                                if (-1 != (this.field_z.field_i[this.field_i] ^ -1)) {
                                  if (this.field_l.d(10770)) {
                                    var2 = 0;
                                    break L5;
                                  } else {
                                    L6: {
                                      if ((this.field_r[this.field_i] ^ -1) == -2) {
                                        break L6;
                                      } else {
                                        discarded$4 = this.a(2, this.field_i, (byte) -30);
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (this.field_r[this.field_i] != 1) {
                                        var7 = new gn();
                                        var7.field_a = (long)this.field_i;
                                        var2 = 0;
                                        this.field_t.a(var7, 3);
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    this.field_i = this.field_i + 1;
                                    continue L4;
                                  }
                                } else {
                                  this.field_i = this.field_i + 1;
                                  continue L4;
                                }
                              }
                            }
                            if (var2 != 0) {
                              this.field_g = false;
                              this.field_i = 0;
                              break L2;
                            } else {
                              var2 = 15 % ((-84 - param0) / 37);
                              if (!this.field_A) {
                                break L0;
                              } else {
                                if ((nj.a(-58) ^ -1L) <= (this.field_y ^ -1L)) {
                                  var3_ref = (vv) ((Object) this.field_v.b(0));
                                  L8: while (true) {
                                    if (var3_ref == null) {
                                      break L1;
                                    } else {
                                      L9: {
                                        if (var3_ref.field_p) {
                                          break L9;
                                        } else {
                                          if (!var3_ref.field_n) {
                                            var3_ref.field_n = true;
                                            break L9;
                                          } else {
                                            if (!var3_ref.field_q) {
                                              throw new RuntimeException();
                                            } else {
                                              var3_ref.c((byte) -109);
                                              break L9;
                                            }
                                          }
                                        }
                                      }
                                      var3_ref = (vv) ((Object) this.field_v.a(-1));
                                      continue L8;
                                    }
                                  }
                                } else {
                                  break L0;
                                }
                              }
                            }
                          }
                        } else {
                          L10: {
                            var4 = (int)var3.field_a;
                            if (-2 == (this.field_r[var4] ^ -1)) {
                              break L10;
                            } else {
                              discarded$5 = this.a(2, var4, (byte) -30);
                              break L10;
                            }
                          }
                          L11: {
                            if (1 != this.field_r[var4]) {
                              var2 = 0;
                              break L11;
                            } else {
                              var3.c((byte) -109);
                              break L11;
                            }
                          }
                          var3 = this.field_t.c(33);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 1;
                    var3 = this.field_t.g(24009);
                    L12: while (true) {
                      if (var3 == null) {
                        L13: while (true) {
                          L14: {
                            if (this.field_z.field_i.length <= this.field_i) {
                              break L14;
                            } else {
                              if (this.field_z.field_i[this.field_i] != 0) {
                                if (this.field_w.field_e >= 250) {
                                  var2 = 0;
                                  break L14;
                                } else {
                                  L15: {
                                    if (0 != this.field_r[this.field_i]) {
                                      break L15;
                                    } else {
                                      discarded$6 = this.a(1, this.field_i, (byte) -30);
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    if (0 == this.field_r[this.field_i]) {
                                      var6 = new gn();
                                      var6.field_a = (long)this.field_i;
                                      var2 = 0;
                                      this.field_t.a(var6, 3);
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                  this.field_i = this.field_i + 1;
                                  continue L13;
                                }
                              } else {
                                this.field_i = this.field_i + 1;
                                continue L13;
                              }
                            }
                          }
                          if (var2 == 0) {
                            break L2;
                          } else {
                            this.field_i = 0;
                            this.field_n = false;
                            break L2;
                          }
                        }
                      } else {
                        L17: {
                          var4 = (int)var3.field_a;
                          if (this.field_r[var4] != 0) {
                            break L17;
                          } else {
                            discarded$7 = this.a(1, var4, (byte) -30);
                            break L17;
                          }
                        }
                        L18: {
                          if (-1 == (this.field_r[var4] ^ -1)) {
                            var2 = 0;
                            break L18;
                          } else {
                            var3.c((byte) -109);
                            break L18;
                          }
                        }
                        var3 = this.field_t.c(33);
                        continue L12;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                break L2;
              }
            }
            var2 = 15 % ((-84 - param0) / 37);
            if (!this.field_A) {
              break L0;
            } else {
              if ((nj.a(-58) ^ -1L) <= (this.field_y ^ -1L)) {
                var3_ref = (vv) ((Object) this.field_v.b(0));
                L19: while (true) {
                  if (var3_ref == null) {
                    break L1;
                  } else {
                    L20: {
                      if (var3_ref.field_p) {
                        break L20;
                      } else {
                        if (!var3_ref.field_n) {
                          var3_ref.field_n = true;
                          break L20;
                        } else {
                          if (!var3_ref.field_q) {
                            throw new RuntimeException();
                          } else {
                            var3_ref.c((byte) -109);
                            break L20;
                          }
                        }
                      }
                    }
                    var3_ref = (vv) ((Object) this.field_v.a(-1));
                    continue L19;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          this.field_y = 1000L + nj.a(116);
          break L0;
        }
    }

    public static void a(byte param0) {
        field_p = null;
        if (param0 > -114) {
            return;
        }
        field_m = null;
        field_u = null;
        field_o = null;
    }

    private final vv a(int param0, int param1, byte param2) {
        hi discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
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
        Object stackIn_59_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_58_0 = null;
        L0: {
          var10 = Kickabout.field_G;
          var12 = (vv) ((Object) this.field_v.a(true, (long)param1));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (param0 != 0) {
              break L0;
            } else {
              if (var12.field_q) {
                break L0;
              } else {
                if (!var12.field_p) {
                  break L0;
                } else {
                  var12.c((byte) -109);
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
              if (param0 == 0) {
                L3: {
                  if (null == this.field_k) {
                    break L3;
                  } else {
                    if (-1 != this.field_r[param1]) {
                      var4 = this.field_w.a(-913, this.field_k, param1);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.field_l.a(25533)) {
                  var4 = this.field_l.a(this.field_h, param1, (byte) 2, (byte) 89, true);
                  break L2;
                } else {
                  return null;
                }
              } else {
                if (param0 == 1) {
                  if (null != this.field_k) {
                    var4 = this.field_w.a(param2 + 8977, param1, this.field_k);
                    break L2;
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
                          break L2;
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
            break L1;
          } else {
            break L1;
          }
        }
        if (!((vv) (var4)).field_p) {
          if (param2 == -30) {
            var18 = ((vv) (var4)).b(12802);
            var13 = var18;
            var5 = var13;
            if (!(var4 instanceof hi)) {
              try {
                L4: {
                  L5: {
                    if (var5 == null) {
                      break L5;
                    } else {
                      if (var18.length <= 2) {
                        break L5;
                      } else {
                        dg.field_b.reset();
                        dg.field_b.update(var5, 0, var18.length - 2);
                        var6_int = (int)dg.field_b.getValue();
                        if (var6_int == this.field_z.field_c[param1]) {
                          L6: {
                            if (null == this.field_z.field_k) {
                              break L6;
                            } else {
                              if (null == this.field_z.field_k[param1]) {
                                break L6;
                              } else {
                                var29 = this.field_z.field_k[param1];
                                var30 = jj.a(-2 + var18.length, var18, (byte) 80, 0);
                                var11 = 0;
                                var9 = var11;
                                L7: while (true) {
                                  if ((var11 ^ -1) <= -65) {
                                    break L6;
                                  } else {
                                    if (var29[var11] != var30[var11]) {
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
                          this.field_l.field_o = 0;
                          this.field_l.field_l = 0;
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
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                this.field_l.c(5);
                ((vv) (var4)).c((byte) -109);
                if (((vv) (var4)).field_q) {
                  if (!this.field_l.a(25533)) {
                    var4 = this.field_l.a(this.field_h, param1, (byte) 2, (byte) 89, true);
                    this.field_v.a((gn) (var4), param2 + 128, (long)param1);
                    return null;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
              L8: {
                var5[-2 + var18.length] = (byte)(this.field_z.field_f[param1] >>> -1666623448);
                var5[-1 + var18.length] = (byte)this.field_z.field_f[param1];
                if (null == this.field_k) {
                  break L8;
                } else {
                  discarded$1 = this.field_w.a(param1, this.field_k, var18, (byte) 66);
                  if ((this.field_r[param1] ^ -1) != -2) {
                    this.field_r[param1] = (byte) 1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (!((vv) (var4)).field_q) {
                  ((vv) (var4)).c((byte) -109);
                  break L9;
                } else {
                  break L9;
                }
              }
              return (vv) (var4);
            } else {
              try {
                L10: {
                  L11: {
                    if (var5 == null) {
                      break L11;
                    } else {
                      if (-3 > (var18.length ^ -1)) {
                        dg.field_b.reset();
                        dg.field_b.update(var5, 0, -2 + var18.length);
                        var6_int = (int)dg.field_b.getValue();
                        if (this.field_z.field_c[param1] == var6_int) {
                          L12: {
                            if (null == this.field_z.field_k) {
                              break L12;
                            } else {
                              if (this.field_z.field_k[param1] == null) {
                                break L12;
                              } else {
                                var28 = this.field_z.field_k[param1];
                                var27 = jj.a(var18.length - 2, var18, (byte) 69, 0);
                                var9 = 0;
                                L13: while (true) {
                                  if (-65 >= (var9 ^ -1)) {
                                    break L12;
                                  } else {
                                    if (var27[var9] != var28[var9]) {
                                      throw new RuntimeException();
                                    } else {
                                      var9++;
                                      continue L13;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var7 = (var5[var18.length - 1] & 255) + ((var5[var18.length - 2] & 255) << 922689160);
                          if (var7 == (this.field_z.field_f[param1] & 65535)) {
                            L14: {
                              if (-2 != (this.field_r[param1] ^ -1)) {
                                L15: {
                                  if (this.field_r[param1] == 0) {
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                this.field_r[param1] = (byte) 1;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            L16: {
                              if (((vv) (var4)).field_q) {
                                break L16;
                              } else {
                                ((vv) (var4)).c((byte) -109);
                                break L16;
                              }
                            }
                            stackOut_58_0 = var4;
                            stackIn_59_0 = stackOut_58_0;
                            break L10;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L17: {
                  var6 = (Exception) (Object) decompiledCaughtException;
                  this.field_r[param1] = (byte)-1;
                  ((vv) (var4)).c((byte) -109);
                  if (((vv) (var4)).field_q) {
                    if (!this.field_l.a(25533)) {
                      var4 = this.field_l.a(this.field_h, param1, (byte) 2, (byte) 89, true);
                      this.field_v.a((gn) (var4), -50, (long)param1);
                      break L17;
                    } else {
                      return null;
                    }
                  } else {
                    break L17;
                  }
                }
                return null;
              }
              return (vv) ((Object) stackIn_59_0);
            }
          } else {
            return (vv) null;
          }
        } else {
          return null;
        }
    }

    final static ut a(byte param0, ut param1, int param2) {
        boolean discarded$2 = false;
        ut var3 = null;
        RuntimeException var3_ref = null;
        ut stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ut stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
                discarded$2 = wm.c((byte) 52);
                break L1;
              }
            }
            param1.c(-param1.field_o + on.field_g, 0);
            ta.e(122);
            ta.e(125);
            stackOut_2_0 = (ut) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("wm.H(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final byte[] b(int param0, int param1) {
        kl discarded$0 = null;
        vv var3 = this.a(0, param0, (byte) -30);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.b(12802);
        if (param1 != 4) {
            discarded$0 = this.a(21);
        }
        var3.c((byte) -109);
        return var4;
    }

    wm(int param0, qh param1, qh param2, bi param3, eb param4, int param5, byte[] param6, int param7, boolean param8) {
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
              ((wm) (this)).field_A = stackIn_7_1 != 0;
              this.field_j = param7;
              this.field_D = param5;
              this.field_w = param4;
              this.field_x = param6;
              this.field_l = param3;
              this.field_q = param2;
              if (null == this.field_q) {
                break L3;
              } else {
                this.field_B = (vv) ((Object) this.field_w.a(-913, this.field_q, this.field_h));
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
            stackOut_10_1 = new StringBuilder().append("wm.<init>(").append(param0).append(',');
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
          throw nb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_p = "Rating";
        field_s = 1;
    }
}
