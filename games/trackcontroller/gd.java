/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends wi {
    static ja field_q;
    private int field_y;
    private id field_v;
    private int field_o;
    private ae field_g;
    static qj field_p;
    private int field_m;
    private hf field_w;
    static oi field_f;
    static boolean field_x;
    private byte[] field_d;
    private tk field_t;
    private pc field_e;
    private sd field_i;
    private byte[] field_u;
    private hf field_n;
    private boolean field_j;
    private boolean field_z;
    private ja field_s;
    private int field_k;
    private ja field_r;
    private boolean field_h;
    private long field_l;

    final int b(int param0, int param1) {
        if (param1 != -21770) {
            this.field_w = (hf) null;
        }
        tk var3 = (tk) ((Object) this.field_v.a(8434, (long)param0));
        if (var3 == null) {
            return 0;
        }
        return var3.a((byte) 43);
    }

    final void a(byte param0) {
        tk discarded$2 = null;
        tk discarded$3 = null;
        fc var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (null != this.field_r) {
          L0: {
            if (param0 == -41) {
              break L0;
            } else {
              this.b(true);
              break L0;
            }
          }
          if (this.a(9) == null) {
            return;
          } else {
            var2 = this.field_s.b(param0 + 43);
            L1: while (true) {
              if (var2 == null) {
                return;
              } else {
                L2: {
                  var3 = (int)var2.field_b;
                  if (-1 >= (var3 ^ -1)) {
                    if (this.field_e.field_n > var3) {
                      if (this.field_e.field_l[var3] == 0) {
                        var2.a(-33);
                        break L2;
                      } else {
                        L3: {
                          if (this.field_d[var3] == 0) {
                            discarded$2 = this.a(1, (byte) -128, var3);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (0 == (this.field_d[var3] ^ -1)) {
                            discarded$3 = this.a(2, (byte) -8, var3);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        if ((this.field_d[var3] ^ -1) != -2) {
                          break L2;
                        } else {
                          var2.a(-108);
                          break L2;
                        }
                      }
                    } else {
                      var2.a(-33);
                      break L2;
                    }
                  } else {
                    var2.a(-33);
                    break L2;
                  }
                }
                var2 = this.field_s.a(10);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        if (null == this.field_w) {
            return;
        }
        if (param0 != 6054) {
            this.field_t = (tk) null;
        }
        this.field_z = true;
        if (!(this.field_r != null)) {
            this.field_r = new ja();
        }
    }

    final static java.applet.Applet b(byte param0) {
        java.applet.Applet discarded$0 = null;
        if (null != q.field_c) {
            return q.field_c;
        }
        if (param0 != 77) {
            discarded$0 = gd.b((byte) -108);
        }
        return (java.applet.Applet) ((Object) f.field_c);
    }

    final byte[] a(int param0, int param1) {
        tk var3 = this.a(0, (byte) 98, param1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.g(param0 + 513);
        var3.a(-86);
        if (param0 != -1) {
            this.field_n = (hf) null;
        }
        return var4;
    }

    public static void c(int param0) {
        java.applet.Applet discarded$0 = null;
        field_p = null;
        if (param0 != -3) {
            discarded$0 = gd.b((byte) -10);
        }
        field_q = null;
        field_f = null;
    }

    final pc a(int param0) {
        lh discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        if (null != this.field_e) {
          return this.field_e;
        } else {
          L0: {
            if (null != this.field_t) {
              break L0;
            } else {
              if (!this.field_g.d(-18316)) {
                this.field_t = (tk) ((Object) this.field_g.a(255, true, false, this.field_m, (byte) 0));
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!this.field_t.field_w) {
            L1: {
              var7 = this.field_t.g(512);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (!(this.field_t instanceof lh)) {
                try {
                  L2: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_e = new pc(var7, this.field_o, this.field_u);
                      break L2;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    this.field_g.b((byte) 107);
                    this.field_e = null;
                    if (!this.field_g.d(param0 ^ -18307)) {
                      this.field_t = (tk) ((Object) this.field_g.a(255, true, false, this.field_m, (byte) 0));
                      break L3;
                    } else {
                      this.field_t = null;
                      break L3;
                    }
                  }
                  return null;
                }
                if (null == this.field_n) {
                  break L1;
                } else {
                  discarded$1 = this.field_i.a(this.field_m, var7, this.field_n, (byte) 117);
                  break L1;
                }
              } else {
                try {
                  L4: {
                    if (var5 != null) {
                      this.field_e = new pc(var7, this.field_o, this.field_u);
                      if (this.field_y == this.field_e.field_k) {
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
                    this.field_e = null;
                    if (this.field_g.d(-18316)) {
                      this.field_t = null;
                      break L5;
                    } else {
                      this.field_t = (tk) ((Object) this.field_g.a(255, true, false, this.field_m, (byte) 0));
                      break L5;
                    }
                  }
                  return null;
                }
                break L1;
              }
            }
            L6: {
              if (this.field_w == null) {
                break L6;
              } else {
                this.field_d = new byte[this.field_e.field_n];
                break L6;
              }
            }
            L7: {
              if (param0 == 9) {
                break L7;
              } else {
                this.b(true);
                break L7;
              }
            }
            this.field_t = null;
            return this.field_e;
          } else {
            return null;
          }
        }
    }

    private final tk a(int param0, byte param1, int param2) {
        lh discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6 = 0;
        Exception var7 = null;
        RuntimeException var7_ref = null;
        int var7_int = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        tk var13 = null;
        byte[] var14 = null;
        byte[] var19 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        Object stackIn_60_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_59_0 = null;
        L0: {
          var11 = TrackController.field_F ? 1 : 0;
          var13 = (tk) ((Object) this.field_v.a(8434, (long)param2));
          var4 = var13;
          if (var13 == null) {
            break L0;
          } else {
            if (0 != param0) {
              break L0;
            } else {
              if (var13.field_q) {
                break L0;
              } else {
                if (var13.field_w) {
                  var13.a(-120);
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
          if (var4 == null) {
            L2: {
              if (0 == param0) {
                L3: {
                  if (this.field_w == null) {
                    break L3;
                  } else {
                    if ((this.field_d[param2] ^ -1) != 0) {
                      var4 = this.field_i.a((byte) 93, param2, this.field_w);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.field_g.d(-18316)) {
                  var4 = this.field_g.a(this.field_m, true, false, param2, (byte) 2);
                  break L2;
                } else {
                  return null;
                }
              } else {
                if (param0 != 1) {
                  if (-3 != (param0 ^ -1)) {
                    throw new RuntimeException();
                  } else {
                    if (null == this.field_w) {
                      throw new RuntimeException();
                    } else {
                      if (this.field_d[param2] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_g.c(-28419)) {
                          var4 = this.field_g.a(this.field_m, false, false, param2, (byte) 2);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                } else {
                  if (null == this.field_w) {
                    throw new RuntimeException();
                  } else {
                    var4 = this.field_i.a(true, param2, this.field_w);
                    break L2;
                  }
                }
              }
            }
            this.field_v.a(false, (long)param2, (fc) (var4));
            break L1;
          } else {
            break L1;
          }
        }
        if (!((tk) (var4)).field_w) {
          var6 = 72 % ((-59 - param1) / 50);
          var19 = ((tk) (var4)).g(512);
          var14 = var19;
          var5 = var14;
          if (!(var4 instanceof lh)) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var19.length > 2) {
                      q.field_k.reset();
                      q.field_k.update(var5, 0, var19.length - 2);
                      var7_int = (int)q.field_k.getValue();
                      if (var7_int != this.field_e.field_b[param2]) {
                        throw new RuntimeException();
                      } else {
                        L6: {
                          if (this.field_e.field_g == null) {
                            break L6;
                          } else {
                            if (this.field_e.field_g[param2] == null) {
                              break L6;
                            } else {
                              var31 = this.field_e.field_g[param2];
                              var30 = cf.a(0, var5, var19.length + -2, -6196);
                              var12 = 0;
                              var10 = var12;
                              L7: while (true) {
                                if ((var12 ^ -1) <= -65) {
                                  break L6;
                                } else {
                                  if (var30[var12] != var31[var12]) {
                                    throw new RuntimeException();
                                  } else {
                                    var12++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                        this.field_g.field_e = 0;
                        this.field_g.field_b = 0;
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
                var7_ref = (RuntimeException) (Object) decompiledCaughtException;
                this.field_g.b((byte) 113);
                ((tk) (var4)).a(-90);
                if (((tk) (var4)).field_q) {
                  if (!this.field_g.d(-18316)) {
                    var4 = this.field_g.a(this.field_m, true, false, param2, (byte) 2);
                    this.field_v.a(false, (long)param2, (fc) (var4));
                    break L8;
                  } else {
                    return null;
                  }
                } else {
                  break L8;
                }
              }
              return null;
            }
            L9: {
              var5[-2 + var19.length] = (byte)(this.field_e.field_d[param2] >>> -190136440);
              var5[var19.length - 1] = (byte)this.field_e.field_d[param2];
              if (null == this.field_w) {
                break L9;
              } else {
                discarded$1 = this.field_i.a(param2, var19, this.field_w, (byte) 92);
                if (this.field_d[param2] == 1) {
                  break L9;
                } else {
                  this.field_d[param2] = (byte) 1;
                  break L9;
                }
              }
            }
            L10: {
              if (!((tk) (var4)).field_q) {
                ((tk) (var4)).a(-52);
                break L10;
              } else {
                break L10;
              }
            }
            return (tk) (var4);
          } else {
            try {
              L11: {
                L12: {
                  if (var5 == null) {
                    break L12;
                  } else {
                    if ((var19.length ^ -1) >= -3) {
                      break L12;
                    } else {
                      q.field_k.reset();
                      q.field_k.update(var5, 0, -2 + var19.length);
                      var7_int = (int)q.field_k.getValue();
                      if (var7_int != this.field_e.field_b[param2]) {
                        throw new RuntimeException();
                      } else {
                        L13: {
                          if (null == this.field_e.field_g) {
                            break L13;
                          } else {
                            if (this.field_e.field_g[param2] == null) {
                              break L13;
                            } else {
                              var29 = this.field_e.field_g[param2];
                              var28 = cf.a(0, var5, -2 + var19.length, -6196);
                              var10 = 0;
                              L14: while (true) {
                                if (-65 >= (var10 ^ -1)) {
                                  break L13;
                                } else {
                                  if (var28[var10] == var29[var10]) {
                                    var10++;
                                    continue L14;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            }
                          }
                        }
                        var8 = (var5[-1 + var19.length] & 255) + (var5[var19.length + -2] << 466316104 & 65280);
                        if ((this.field_e.field_d[param2] & 65535) == var8) {
                          L15: {
                            if (this.field_d[param2] == 1) {
                              break L15;
                            } else {
                              L16: {
                                if (-1 == (this.field_d[param2] ^ -1)) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              this.field_d[param2] = (byte) 1;
                              break L15;
                            }
                          }
                          L17: {
                            if (!((tk) (var4)).field_q) {
                              ((tk) (var4)).a(-59);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          stackOut_59_0 = var4;
                          stackIn_60_0 = stackOut_59_0;
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
              var7 = (Exception) (Object) decompiledCaughtException;
              this.field_d[param2] = (byte)-1;
              ((tk) (var4)).a(-122);
              if (((tk) (var4)).field_q) {
                L18: {
                  if (!this.field_g.d(-18316)) {
                    var4 = this.field_g.a(this.field_m, true, false, param2, (byte) 2);
                    this.field_v.a(false, (long)param2, (fc) (var4));
                    break L18;
                  } else {
                    break L18;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            return (tk) ((Object) stackIn_60_0);
          }
        } else {
          return null;
        }
    }

    final void b(boolean param0) {
        tk discarded$4 = null;
        tk discarded$5 = null;
        tk discarded$6 = null;
        tk discarded$7 = null;
        int var2_int = 0;
        tk var2 = null;
        fc var3 = null;
        int var4 = 0;
        int var5 = 0;
        fc var6 = null;
        fc var7 = null;
        L0: {
          L1: {
            L2: {
              var5 = TrackController.field_F ? 1 : 0;
              if (null == this.field_r) {
                break L2;
              } else {
                if (this.a(9) != null) {
                  if (this.field_j) {
                    var2_int = 1;
                    var3 = this.field_r.b(2);
                    L3: while (true) {
                      if (var3 == null) {
                        L4: while (true) {
                          L5: {
                            if (this.field_e.field_l.length <= this.field_k) {
                              break L5;
                            } else {
                              if (-1 != (this.field_e.field_l[this.field_k] ^ -1)) {
                                if (-251 < (this.field_i.field_a ^ -1)) {
                                  L6: {
                                    if (this.field_d[this.field_k] == 0) {
                                      discarded$4 = this.a(1, (byte) 2, this.field_k);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    if (-1 == (this.field_d[this.field_k] ^ -1)) {
                                      var7 = new fc();
                                      var7.field_b = (long)this.field_k;
                                      var2_int = 0;
                                      this.field_r.a((byte) -128, var7);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  this.field_k = this.field_k + 1;
                                  continue L4;
                                } else {
                                  var2_int = 0;
                                  break L5;
                                }
                              } else {
                                this.field_k = this.field_k + 1;
                                continue L4;
                              }
                            }
                          }
                          if (var2_int == 0) {
                            break L2;
                          } else {
                            this.field_k = 0;
                            this.field_j = false;
                            break L2;
                          }
                        }
                      } else {
                        L8: {
                          var4 = (int)var3.field_b;
                          if (0 == this.field_d[var4]) {
                            discarded$5 = this.a(1, (byte) 90, var4);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_d[var4] != 0) {
                            var3.a(-47);
                            break L9;
                          } else {
                            var2_int = 0;
                            break L9;
                          }
                        }
                        var3 = this.field_r.a(10);
                        continue L3;
                      }
                    }
                  } else {
                    if (this.field_z) {
                      var2_int = 1;
                      var3 = this.field_r.b(2);
                      L10: while (true) {
                        if (var3 == null) {
                          L11: while (true) {
                            L12: {
                              if (this.field_e.field_l.length <= this.field_k) {
                                break L12;
                              } else {
                                if (this.field_e.field_l[this.field_k] != 0) {
                                  if (this.field_g.c(-28419)) {
                                    var2_int = 0;
                                    break L12;
                                  } else {
                                    L13: {
                                      if ((this.field_d[this.field_k] ^ -1) == -2) {
                                        break L13;
                                      } else {
                                        discarded$6 = this.a(2, (byte) -120, this.field_k);
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (this.field_d[this.field_k] != 1) {
                                        var6 = new fc();
                                        var6.field_b = (long)this.field_k;
                                        this.field_r.a((byte) -110, var6);
                                        var2_int = 0;
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    this.field_k = this.field_k + 1;
                                    continue L11;
                                  }
                                } else {
                                  this.field_k = this.field_k + 1;
                                  continue L11;
                                }
                              }
                            }
                            if (var2_int != 0) {
                              this.field_k = 0;
                              this.field_z = false;
                              break L2;
                            } else {
                              L15: {
                                if (!param0) {
                                  break L15;
                                } else {
                                  this.field_j = false;
                                  break L15;
                                }
                              }
                              if (!this.field_h) {
                                break L0;
                              } else {
                                if (qg.a(false) < this.field_l) {
                                  break L0;
                                } else {
                                  var2 = (tk) ((Object) this.field_v.b(-49));
                                  L16: while (true) {
                                    if (var2 == null) {
                                      break L1;
                                    } else {
                                      L17: {
                                        if (var2.field_w) {
                                          break L17;
                                        } else {
                                          if (var2.field_v) {
                                            if (!var2.field_q) {
                                              throw new RuntimeException();
                                            } else {
                                              var2.a(-109);
                                              break L17;
                                            }
                                          } else {
                                            var2.field_v = true;
                                            break L17;
                                          }
                                        }
                                      }
                                      var2 = (tk) ((Object) this.field_v.a((byte) 91));
                                      continue L16;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L18: {
                            var4 = (int)var3.field_b;
                            if ((this.field_d[var4] ^ -1) != -2) {
                              discarded$7 = this.a(2, (byte) 104, var4);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            if ((this.field_d[var4] ^ -1) != -2) {
                              var2_int = 0;
                              break L19;
                            } else {
                              var3.a(-76);
                              break L19;
                            }
                          }
                          var3 = this.field_r.a(10);
                          continue L10;
                        }
                      }
                    } else {
                      this.field_r = null;
                      break L2;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L20: {
              if (!param0) {
                break L20;
              } else {
                this.field_j = false;
                break L20;
              }
            }
            if (!this.field_h) {
              break L0;
            } else {
              if (qg.a(false) < this.field_l) {
                break L0;
              } else {
                var2 = (tk) ((Object) this.field_v.b(-49));
                L21: while (true) {
                  if (var2 == null) {
                    break L1;
                  } else {
                    L22: {
                      if (var2.field_w) {
                        break L22;
                      } else {
                        if (var2.field_v) {
                          if (!var2.field_q) {
                            throw new RuntimeException();
                          } else {
                            var2.a(-109);
                            break L22;
                          }
                        } else {
                          var2.field_v = true;
                          break L22;
                        }
                      }
                    }
                    var2 = (tk) ((Object) this.field_v.a((byte) 91));
                    continue L21;
                  }
                }
              }
            }
          }
          this.field_l = qg.a(false) + 1000L;
          break L0;
        }
    }

    gd(int param0, hf param1, hf param2, ae param3, sd param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_v = new id(16);
        this.field_k = 0;
        this.field_s = new ja();
        this.field_l = 0L;
        try {
          L0: {
            L1: {
              this.field_m = param0;
              this.field_w = param1;
              if (null == this.field_w) {
                this.field_j = false;
                break L1;
              } else {
                this.field_j = true;
                this.field_r = new ja();
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
              ((gd) (this)).field_h = stackIn_7_1 != 0;
              this.field_o = param5;
              this.field_y = param7;
              this.field_n = param2;
              this.field_u = param6;
              this.field_g = param3;
              this.field_i = param4;
              if (null == this.field_n) {
                break L3;
              } else {
                this.field_t = (tk) ((Object) this.field_i.a((byte) -113, this.field_m, this.field_n));
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
            stackOut_10_1 = new StringBuilder().append("gd.<init>(").append(param0).append(',');
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
          throw sl.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_q = new ja();
        field_x = false;
        field_f = new oi();
    }
}
