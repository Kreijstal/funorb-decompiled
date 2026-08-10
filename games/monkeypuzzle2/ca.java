/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends rf {
    private byte[] field_i;
    private int field_w;
    private int field_u;
    private gf field_g;
    private wd field_c;
    static le field_f;
    private gf field_p;
    private cg field_q;
    private int field_t;
    private wl field_r;
    private fb field_o;
    private uj field_v;
    static String field_n;
    private byte[] field_s;
    private pj field_j;
    private pj field_h;
    private boolean field_m;
    private boolean field_d;
    private int field_l;
    private boolean field_k;
    private long field_e;

    final void c(int param0) {
        fb discarded$0 = null;
        fb discarded$1 = null;
        fb discarded$2 = null;
        fb discarded$3 = null;
        int var2_int;
        fb var2;
        ug var3;
        int var4;
        int var5;
        ug var6;
        ug var7;
        L0: {
          var5 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (null != this.field_h) {
            if (null == this.a((byte) 119)) {
              return;
            } else {
              if (!this.field_d) {
                if (this.field_m) {
                  var2_int = 1;
                  var3 = this.field_h.a((byte) -117);
                  L1: while (true) {
                    if (var3 == null) {
                      L2: while (true) {
                        L3: {
                          if (this.field_l >= this.field_c.field_m.length) {
                            break L3;
                          } else {
                            if (this.field_c.field_m[this.field_l] != 0) {
                              if (!this.field_r.a(20)) {
                                L4: {
                                  if ((this.field_s[this.field_l] ^ -1) == -2) {
                                    break L4;
                                  } else {
                                    discarded$0 = this.a(param0 + -16309, 2, this.field_l);
                                    break L4;
                                  }
                                }
                                L5: {
                                  if ((this.field_s[this.field_l] ^ -1) == -2) {
                                    break L5;
                                  } else {
                                    var7 = new ug();
                                    var7.field_a = (long)this.field_l;
                                    var2_int = 0;
                                    this.field_h.a(-8212, var7);
                                    break L5;
                                  }
                                }
                                this.field_l = this.field_l + 1;
                                continue L2;
                              } else {
                                var2_int = 0;
                                break L3;
                              }
                            } else {
                              this.field_l = this.field_l + 1;
                              continue L2;
                            }
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          this.field_l = 0;
                          this.field_m = false;
                          break L0;
                        }
                      }
                    } else {
                      L6: {
                        var4 = (int)var3.field_a;
                        if (1 == this.field_s[var4]) {
                          break L6;
                        } else {
                          discarded$1 = this.a(2, 2, var4);
                          break L6;
                        }
                      }
                      L7: {
                        if (this.field_s[var4] == 1) {
                          var3.c(param0 + -36133);
                          break L7;
                        } else {
                          var2_int = 0;
                          break L7;
                        }
                      }
                      var3 = this.field_h.d((byte) 63);
                      continue L1;
                    }
                  }
                } else {
                  this.field_h = null;
                  break L0;
                }
              } else {
                var2_int = 1;
                var3 = this.field_h.a((byte) -117);
                L8: while (true) {
                  if (var3 == null) {
                    L9: while (true) {
                      L10: {
                        if (this.field_c.field_m.length <= this.field_l) {
                          break L10;
                        } else {
                          L11: {
                            if (this.field_c.field_m[this.field_l] == 0) {
                              break L11;
                            } else {
                              if (250 > this.field_v.field_j) {
                                L12: {
                                  if (0 != this.field_s[this.field_l]) {
                                    break L12;
                                  } else {
                                    discarded$2 = this.a(param0 ^ 16309, 1, this.field_l);
                                    break L12;
                                  }
                                }
                                if (-1 == (this.field_s[this.field_l] ^ -1)) {
                                  var6 = new ug();
                                  var6.field_a = (long)this.field_l;
                                  var2_int = 0;
                                  this.field_h.a(-8212, var6);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              } else {
                                var2_int = 0;
                                break L10;
                              }
                            }
                          }
                          this.field_l = this.field_l + 1;
                          continue L9;
                        }
                      }
                      if (var2_int != 0) {
                        this.field_l = 0;
                        this.field_d = false;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    L13: {
                      var4 = (int)var3.field_a;
                      if ((this.field_s[var4] ^ -1) != -1) {
                        break L13;
                      } else {
                        discarded$3 = this.a(2, 1, var4);
                        break L13;
                      }
                    }
                    L14: {
                      if (this.field_s[var4] == 0) {
                        var2_int = 0;
                        break L14;
                      } else {
                        var3.c(-19822);
                        break L14;
                      }
                    }
                    var3 = this.field_h.d((byte) 63);
                    continue L8;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        L15: {
          if (param0 == 16311) {
            break L15;
          } else {
            this.field_q = (cg) null;
            break L15;
          }
        }
        L16: {
          if (!this.field_k) {
            break L16;
          } else {
            if (pf.a(0) >= this.field_e) {
              var2 = (fb) ((Object) this.field_q.a(0));
              L17: while (true) {
                if (var2 == null) {
                  this.field_e = pf.a(param0 + -16311) - -1000L;
                  break L16;
                } else {
                  L18: {
                    if (!var2.field_j) {
                      if (!var2.field_l) {
                        var2.field_l = true;
                        break L18;
                      } else {
                        if (!var2.field_m) {
                          throw new RuntimeException();
                        } else {
                          var2.c(param0 + -36133);
                          break L18;
                        }
                      }
                    } else {
                      break L18;
                    }
                  }
                  var2 = (fb) ((Object) this.field_q.a((byte) -55));
                  continue L17;
                }
              }
            } else {
              break L16;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8) {
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param8 ^ -1) > -1) {
                break L1;
              } else {
                if (param2 < ig.field_a) {
                  L2: {
                    if (0 <= param3) {
                      break L2;
                    } else {
                      if (0 <= param1) {
                        break L2;
                      } else {
                        if ((param4 ^ -1) <= -1) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param3 < ig.field_c) {
                      break L3;
                    } else {
                      if (ig.field_c > param1) {
                        break L3;
                      } else {
                        if (param4 >= ig.field_c) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param8 - param2;
                    if (param2 == param5) {
                      L5: {
                        if (param2 != param8) {
                          var15 = -param5 + param8;
                          if (param3 < param1) {
                            var9_int = param3 << -1255229904;
                            var11 = (param4 + -param3 << -1920850064) / var14;
                            var10 = param1 << 153523568;
                            var12 = (-param1 + param4 << -770577040) / var15;
                            break L5;
                          } else {
                            var11 = (param4 - param1 << -2104365488) / var15;
                            var12 = (-param3 + param4 << 1775351792) / var14;
                            var10 = param3 << -2018670416;
                            var9_int = param1 << -673218416;
                            break L5;
                          }
                        } else {
                          var11 = 0;
                          var12 = 0;
                          var10 = param1 << -1036959120;
                          var9_int = param3 << 518856656;
                          break L5;
                        }
                      }
                      L6: {
                        if ((param2 ^ -1) <= -1) {
                          break L6;
                        } else {
                          param2 = Math.min(-param2, param5 - param2);
                          var10 = var10 + var12 * param2;
                          var9_int = var9_int + param2 * var11;
                          param2 = 0;
                          break L6;
                        }
                      }
                      var13 = 0;
                      break L4;
                    } else {
                      L7: {
                        var10 = param3 << 902842864;
                        var9_int = param3 << 902842864;
                        var15 = -param2 + param5;
                        var11 = (param1 + -param3 << 990415344) / var15;
                        var12 = (-param3 + param4 << 446997328) / var14;
                        if (var11 >= var12) {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L7;
                        } else {
                          var13 = 0;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if (-1 >= (param2 ^ -1)) {
                            break L9;
                          } else {
                            if (-1 < (param5 ^ -1)) {
                              param2 = param5 + -param2;
                              var9_int = var9_int + var11 * param2;
                              var10 = var10 + param2 * var12;
                              param2 = param5;
                              break L8;
                            } else {
                              param2 = -param2;
                              var9_int = var9_int + var11 * param2;
                              var10 = var10 + param2 * var12;
                              param2 = 0;
                              break L9;
                            }
                          }
                        }
                        var16 = ig.field_i[param2];
                        L10: while (true) {
                          if (param5 <= param2) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> -1066765616;
                              if ((ig.field_c ^ -1) >= (var17 ^ -1)) {
                                break L11;
                              } else {
                                var18 = (var10 >> -626495920) - (var9_int >> -1089888656);
                                if (-1 != (var18 ^ -1)) {
                                  L12: {
                                    if (var18 + var17 >= ig.field_c) {
                                      var18 = ig.field_c + (-var17 - 1);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (var17 >= 0) {
                                    tl.a(var18, param0, (byte) -76, var16 + var17, param6);
                                    break L11;
                                  } else {
                                    tl.a(var17 + var18, param0, (byte) -115, var16, param6);
                                    break L11;
                                  }
                                } else {
                                  if (-1 < (var17 ^ -1)) {
                                    break L11;
                                  } else {
                                    if (ig.field_c > var17) {
                                      tl.a(var18, param0, (byte) -97, var17 - -var16, param6);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            param2++;
                            if (ig.field_a > param2) {
                              var16 = var16 + ge.field_h;
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              continue L10;
                            } else {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      var16 = -param5 + param8;
                      if (0 == var16) {
                        var12 = 0;
                        var11 = 0;
                        break L4;
                      } else {
                        L13: {
                          var17 = param4 << -1883128432;
                          if (var13 != 0) {
                            var10 = param1 << -828187472;
                            break L13;
                          } else {
                            var9_int = param1 << -24185264;
                            break L13;
                          }
                        }
                        var12 = (var17 - var10) / var16;
                        var11 = (var17 - var9_int) / var16;
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if (0 > param2) {
                      param2 = -param2;
                      var9_int = var9_int + var11 * param2;
                      var10 = var10 + param2 * var12;
                      param2 = 0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (param7 == -18427) {
                      break L15;
                    } else {
                      field_n = (String) null;
                      break L15;
                    }
                  }
                  var15 = ig.field_i[param2];
                  L16: while (true) {
                    if (param2 >= param8) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L17: {
                        var16 = var9_int >> 80729840;
                        if (ig.field_c > var16) {
                          var17 = (var10 >> -1946454256) - (var9_int >> -1200449552);
                          if (-1 == (var17 ^ -1)) {
                            if (-1 < (var16 ^ -1)) {
                              break L17;
                            } else {
                              if (ig.field_c > var16) {
                                tl.a(var17, param0, (byte) -106, var15 + var16, param6);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          } else {
                            L18: {
                              if (var16 + var17 >= ig.field_c) {
                                var17 = -var16 + (ig.field_c + -1);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            if (0 > var16) {
                              tl.a(var17 + var16, param0, (byte) -91, var15, param6);
                              break L17;
                            } else {
                              tl.a(var17, param0, (byte) -106, var16 - -var15, param6);
                              break L17;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                      param2++;
                      if (ig.field_a > param2) {
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        var15 = var15 + ge.field_h;
                        continue L16;
                      } else {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var9 = decompiledCaughtException;
            stackIn_79_0 = (RuntimeException) (var9);

            stackIn_79_1 = new StringBuilder().append("ca.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L19;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L19;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param7 + ',' + param8 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final wd a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null == this.field_c) {
          L0: {
            if (param0 >= 39) {
              break L0;
            } else {
              this.field_e = -112L;
              break L0;
            }
          }
          L1: {
            if (this.field_o == null) {
              if (!this.field_r.d(20)) {
                this.field_o = (fb) ((Object) this.field_r.a(255, this.field_u, 102, true, (byte) 0));
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (!this.field_o.field_j) {
            L2: {
              var7 = this.field_o.e(125);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (this.field_o instanceof si) {
                try {
                  L3: {
                    if (var5 != null) {
                      this.field_c = new wd(var7, this.field_w, this.field_i);
                      if (this.field_c.field_l == this.field_t) {
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
                    this.field_c = null;
                    if (this.field_r.d(20)) {
                      this.field_o = null;
                      break L4;
                    } else {
                      this.field_o = (fb) ((Object) this.field_r.a(255, this.field_u, 91, true, (byte) 0));
                      break L4;
                    }
                  }
                  return null;
                }
                break L2;
              } else {
                try {
                  L5: {
                    if (var5 != null) {
                      this.field_c = new wd(var7, this.field_w, this.field_i);
                      break L5;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    this.field_r.b(20);
                    this.field_c = null;
                    if (!this.field_r.d(20)) {
                      this.field_o = (fb) ((Object) this.field_r.a(255, this.field_u, 75, true, (byte) 0));
                      break L6;
                    } else {
                      this.field_o = null;
                      break L6;
                    }
                  }
                  return null;
                }
                if (null != this.field_p) {
                  this.field_v.a(false, this.field_u, var7, this.field_p);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L7: {
              this.field_o = null;
              if (this.field_g != null) {
                this.field_s = new byte[this.field_c.field_e];
                break L7;
              } else {
                break L7;
              }
            }
            return this.field_c;
          } else {
            return null;
          }
        } else {
          return this.field_c;
        }
    }

    final byte[] b(int param0, int param1) {
        fb var3 = this.a(2, 0, param1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.e(-81);
        var3.c(-19822);
        if (param0 >= -110) {
            return (byte[]) null;
        }
        return var4;
    }

    private final fb a(int param0, int param1, int param2) {
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        Object stackIn_91_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        fb var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        L0: {
          var10 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == 2) {
            break L0;
          } else {
            this.field_w = 1;
            break L0;
          }
        }
        L1: {
          var12 = (fb) ((Object) this.field_q.a((byte) 119, (long)param2));
          var4 = var12;
          if (var12 == null) {
            break L1;
          } else {
            if (-1 != (param1 ^ -1)) {
              break L1;
            } else {
              if (var12.field_m) {
                break L1;
              } else {
                if (var12.field_j) {
                  var12.c(param0 + -19824);
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
              if (0 == param1) {
                L4: {
                  if (this.field_g == null) {
                    break L4;
                  } else {
                    if (0 != (this.field_s[param2] ^ -1)) {
                      var4 = this.field_v.a(this.field_g, 1, param2);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!this.field_r.d(20)) {
                  var4 = this.field_r.a(this.field_u, param2, 103, true, (byte) 2);
                  break L3;
                } else {
                  return null;
                }
              } else {
                if ((param1 ^ -1) == -2) {
                  if (this.field_g != null) {
                    var4 = this.field_v.a(param2, this.field_g, (byte) -127);
                    break L3;
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (2 == param1) {
                    if (null == this.field_g) {
                      throw new RuntimeException();
                    } else {
                      if ((this.field_s[param2] ^ -1) != 0) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_r.a(param0 + 18)) {
                          var4 = this.field_r.a(this.field_u, param2, 82, false, (byte) 2);
                          break L3;
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
            this.field_q.a((ug) (var4), (long)param2, (byte) -36);
            break L2;
          }
        }
        if (!((fb) (var4)).field_j) {
          var18 = ((fb) (var4)).e(119);
          var13 = var18;
          var5 = var13;
          if (var4 instanceof si) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (-3 <= (var18.length ^ -1)) {
                      break L6;
                    } else {
                      cl.field_f.reset();
                      cl.field_f.update(var5, 0, var18.length + -2);
                      var6_int = (int)cl.field_f.getValue();
                      if (var6_int != this.field_c.field_j[param2]) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          if (null == this.field_c.field_n) {
                            break L7;
                          } else {
                            if (null == this.field_c.field_n[param2]) {
                              break L7;
                            } else {
                              var29 = this.field_c.field_n[param2];
                              var30 = ie.a(-68, var5, -2 + var18.length, 0);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (var11 >= 64) {
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
                        var7 = (255 & var5[var18.length + -1]) + (65280 & var5[var18.length - 2] << -966258616);
                        if (var7 == (65535 & this.field_c.field_p[param2])) {
                          L9: {
                            if ((this.field_s[param2] ^ -1) == -2) {
                              break L9;
                            } else {
                              L10: {
                                if (0 == this.field_s[param2]) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              this.field_s[param2] = (byte) 1;
                              break L9;
                            }
                          }
                          L11: {
                            if (((fb) (var4)).field_m) {
                              break L11;
                            } else {
                              ((fb) (var4)).c(-19822);
                              break L11;
                            }
                          }
                          stackIn_91_0 = var4;
                          break L5;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L12: {
                var6 = (Exception) (Object) decompiledCaughtException;
                this.field_s[param2] = (byte)-1;
                ((fb) (var4)).c(-19822);
                if (((fb) (var4)).field_m) {
                  if (!this.field_r.d(param0 + 18)) {
                    var4 = this.field_r.a(this.field_u, param2, 83, true, (byte) 2);
                    this.field_q.a((ug) (var4), (long)param2, (byte) -36);
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
            return (fb) ((Object) stackIn_91_0);
          } else {
            try {
              L13: {
                L14: {
                  if (var5 == null) {
                    break L14;
                  } else {
                    if (-3 <= (var18.length ^ -1)) {
                      break L14;
                    } else {
                      cl.field_f.reset();
                      cl.field_f.update(var5, 0, -2 + var18.length);
                      var6_int = (int)cl.field_f.getValue();
                      if (var6_int == this.field_c.field_j[param2]) {
                        L15: {
                          if (null == this.field_c.field_n) {
                            break L15;
                          } else {
                            if (this.field_c.field_n[param2] != null) {
                              var28 = this.field_c.field_n[param2];
                              var27 = ie.a(param0 + -109, var5, -2 + var18.length, 0);
                              var9 = 0;
                              L16: while (true) {
                                if (-65 >= (var9 ^ -1)) {
                                  break L15;
                                } else {
                                  if ((var27[var9] ^ -1) != (var28[var9] ^ -1)) {
                                    throw new RuntimeException();
                                  } else {
                                    var9++;
                                    continue L16;
                                  }
                                }
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                        this.field_r.field_b = 0;
                        this.field_r.field_a = 0;
                        break L13;
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
              L17: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                this.field_r.b(20);
                ((fb) (var4)).c(-19822);
                if (((fb) (var4)).field_m) {
                  if (!this.field_r.d(param0 + 18)) {
                    var4 = this.field_r.a(this.field_u, param2, param0 + 112, true, (byte) 2);
                    this.field_q.a((ug) (var4), (long)param2, (byte) -36);
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
            L18: {
              var5[var18.length + -2] = (byte)(this.field_c.field_p[param2] >>> 493083208);
              var5[-1 + var18.length] = (byte)this.field_c.field_p[param2];
              if (this.field_g == null) {
                break L18;
              } else {
                this.field_v.a(false, param2, var18, this.field_g);
                stackIn_61_0 = this.field_s[param2] ^ -1;
                stackIn_61_1 = -2;
                if (stackIn_61_0 == stackIn_61_1) {
                  break L18;
                } else {
                  this.field_s[param2] = (byte) 1;
                  break L18;
                }
              }
            }
            L19: {
              if (!((fb) (var4)).field_m) {
                ((fb) (var4)).c(-19822);
                break L19;
              } else {
                break L19;
              }
            }
            return (fb) (var4);
          }
        } else {
          return null;
        }
    }

    final void b(int param0) {
        fb discarded$0 = null;
        fb discarded$1 = null;
        ug var2;
        int var3;
        int var4;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null == this.field_h) {
          return;
        } else {
          if (param0 == -1) {
            if (null == this.a((byte) 53)) {
              return;
            } else {
              var2 = this.field_j.a((byte) -117);
              L0: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  L1: {
                    var3 = (int)var2.field_a;
                    if (-1 >= (var3 ^ -1)) {
                      if (this.field_c.field_e > var3) {
                        if (-1 == (this.field_c.field_m[var3] ^ -1)) {
                          var2.c(-19822);
                          break L1;
                        } else {
                          L2: {
                            if (this.field_s[var3] != 0) {
                              break L2;
                            } else {
                              discarded$0 = this.a(2, 1, var3);
                              break L2;
                            }
                          }
                          L3: {
                            if (-1 == this.field_s[var3]) {
                              discarded$1 = this.a(2, 2, var3);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          if (-2 == (this.field_s[var3] ^ -1)) {
                            var2.c(-19822);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        var2.c(-19822);
                        break L1;
                      }
                    } else {
                      var2.c(-19822);
                      break L1;
                    }
                  }
                  var2 = this.field_j.d((byte) 63);
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    public static void d(int param0) {
        if (param0 != -1) {
            field_f = (le) null;
        }
        field_n = null;
        field_f = null;
    }

    final int a(int param0, int param1) {
        fb discarded$0 = null;
        fb var3 = (fb) ((Object) this.field_q.a((byte) 112, (long)param1));
        if (param0 >= -42) {
            discarded$0 = this.a(85, 123, 107);
        }
        if (var3 == null) {
            return 0;
        }
        return var3.a(true);
    }

    final void a(int param0) {
        if (!(this.field_g != null)) {
            return;
        }
        if (param0 != -1) {
            this.a(-68, -82);
        }
        this.field_m = true;
        if (null == this.field_h) {
            this.field_h = new pj();
        }
    }

    ca(int param0, gf param1, gf param2, wl param3, uj param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_q = new cg(16);
        this.field_l = 0;
        this.field_j = new pj();
        this.field_e = 0L;
        try {
          L0: {
            L1: {
              this.field_g = param1;
              this.field_u = param0;
              if (this.field_g == null) {
                this.field_d = false;
                break L1;
              } else {
                this.field_d = true;
                this.field_h = new pj();
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
              ((ca) (this)).field_k = stackIn_7_1 != 0;
              this.field_t = param7;
              this.field_r = param3;
              this.field_v = param4;
              this.field_w = param5;
              this.field_i = param6;
              this.field_p = param2;
              if (null == this.field_p) {
                break L3;
              } else {
                this.field_o = (fb) ((Object) this.field_v.a(this.field_p, 1, this.field_u));
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var10);

            stackIn_12_1 = new StringBuilder().append("ca.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_n = "Play the game without logging in just yet";
        field_f = new le(270, 70);
    }
}
